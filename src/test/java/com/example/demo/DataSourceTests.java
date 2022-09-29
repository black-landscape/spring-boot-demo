package com.example.demo;

import com.example.demo.primary.User;
import com.example.demo.primary.UserRepository;
import com.example.demo.secondary.Message;
import com.example.demo.secondary.MessageRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MessageRepository messageRepository;

    @Test
    public void test() throws Exception {
        userRepository.save(new User("aaa", 10));
        userRepository.save(new User("bbb", 20));
        userRepository.save(new User("ccc", 30));
        userRepository.save(new User("ddd", 40));
        userRepository.save(new User("eee", 50));

        Assert.assertEquals(5, userRepository.findAll().size());

        messageRepository.save(new Message("01", "aaaaaaaaaa"));
        messageRepository.save(new Message("02", "bbbbbbbbbb"));
        messageRepository.save(new Message("03", "cccccccccc"));

        Assert.assertEquals(3, messageRepository.findAll().size());
    }
}
