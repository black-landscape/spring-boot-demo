package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void test() throws Exception {
        System.out.println("CacheManager type : " + cacheManager.getClass());

        userRepository.save(new User("AAA", 10));

        User u1 = userRepository.findByName("AAA");
        System.out.println("第一次查询: " + u1.getAge());

        User u2 = userRepository.findByName("AAA");
        System.out.println("第二次查询: " + u2.getAge());

        userRepository.deleteAllInBatch();
    }
}
