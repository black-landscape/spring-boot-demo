package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    @Rollback
    public void test() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        log.info(u.toString());
        Assert.assertEquals(20, u.getAge().intValue());

        u.setAge(30);
        userMapper.update(u);
        u = userMapper.findByName("AAA");
        log.info(u.toString());
        Assert.assertEquals(30, u.getAge().intValue());

        userMapper.delete(u.getId());
        u = userMapper.findByName("AAA");
        Assert.assertEquals(null, u);

        Map<String, Object> map = new HashMap<>();
        map.put("name", "CCC");
        map.put("age", 40);
        userMapper.insertByMap(map);
        User u2 = userMapper.findByName("CCC");
        Assert.assertEquals(40, u2.getAge().intValue());

        userMapper.insertByUser(new User("DDD", 50));
        User u3 = userMapper.findByName("DDD");
        Assert.assertEquals(50, u3.getAge().intValue());
    }

    @Test
    @Rollback
    public void testUserMapper() throws Exception {
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            Assert.assertEquals(null, user.getId());
            Assert.assertNotEquals(null, user.getName());
        }
    }
}
