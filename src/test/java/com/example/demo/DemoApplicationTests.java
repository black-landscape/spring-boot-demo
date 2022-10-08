package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
public class DemoApplicationTests {
    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void test() throws Exception {
        userInfoRepository.deleteAll();

        userInfoRepository.save(new UserInfo("AAA", 10));
        userInfoRepository.save(new UserInfo("BBB", 20));
        userInfoRepository.save(new UserInfo("CCC", 30));
        userInfoRepository.save(new UserInfo("DDD", 40));
        userInfoRepository.save(new UserInfo("EEE", 50));
        userInfoRepository.save(new UserInfo("FFF", 60));
        userInfoRepository.save(new UserInfo("GGG", 70));
        userInfoRepository.save(new UserInfo("HHH", 80));
        userInfoRepository.save(new UserInfo("III", 90));
        userInfoRepository.save(new UserInfo("JJJ", 100));

        Assertions.assertEquals(10, userInfoRepository.findAll().size());

        Assertions.assertEquals(60, userInfoRepository.findByName("FFF").getAge().longValue());

        Assertions.assertEquals(60, userInfoRepository.findUser("FFF").getAge().longValue());

        Assertions.assertEquals(60, userInfoRepository.findByNameAndAge("FFF", 60).getAge().longValue());

        userInfoRepository.delete(userInfoRepository.findByName("AAA"));

        Assertions.assertEquals(9, userInfoRepository.findAll().size());
    }
}
