package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DemoTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test() throws Exception {
        userRepository.deleteAll();

        userRepository.save(new User(1L, "didi", 30));
        userRepository.save(new User(2L, "mama", 40));
        userRepository.save(new User(3L, "kaka", 50));
        Assertions.assertEquals(3, userRepository.findAll().size());

        User u = userRepository.findById(1L).get();
        userRepository.delete(u);
        Assertions.assertEquals(2, userRepository.findAll().size());

        u = userRepository.findByUsername("mama");
        userRepository.delete(u);
        Assertions.assertEquals(1, userRepository.findAll().size());
    }
}
