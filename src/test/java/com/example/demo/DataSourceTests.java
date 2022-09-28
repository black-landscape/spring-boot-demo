package com.example.demo;

import com.example.demo.primary.UserMapperPrimary;
import com.example.demo.primary.UserPrimary;
import com.example.demo.secondary.UserMapperSecondary;
import com.example.demo.secondary.UserSecondary;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class DataSourceTests {

    @Autowired
    private UserMapperPrimary userMapperPrimary;

    @Autowired
    private UserMapperSecondary userMapperSecondary;

    @Before
    public void setUp() {
        userMapperPrimary.deleteAll();
        userMapperSecondary.deleteAll();
    }

    @Test
    public void test() throws Exception {
        userMapperPrimary.insert("AAA", 20);

        UserPrimary userPrimary = userMapperPrimary.findByName("AAA");
        Assert.assertEquals(20, userPrimary.getAge().intValue());

        UserSecondary userSecondary = userMapperSecondary.findByName("AAA");
        Assert.assertNull(userSecondary);

        userMapperSecondary.insert("BBB", 20);

        userPrimary = userMapperPrimary.findByName("BBB");
        Assert.assertNull(userPrimary);

        userSecondary = userMapperSecondary.findByName("BBB");
        Assert.assertEquals(20, userSecondary.getAge().intValue());
    }
}
