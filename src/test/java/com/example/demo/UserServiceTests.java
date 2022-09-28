package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
        userService.deleteAllUsers();
    }

    @Test
    public void test() throws Exception {
        userService.create("Tom", 10);
        userService.create("Mike", 11);
        userService.create("Didispace", 30);
        userService.create("Oscar", 21);
        userService.create("Linda", 17);

        List<User> userList = userService.getByName("Oscar");
        Assert.assertEquals(21, userList.get(0).getAge().intValue());

        Assert.assertEquals(5, userService.getAllUsers());

        userService.deleteByName("Tom");
        userService.deleteByName("Mike");

        Assert.assertEquals(3, userService.getAllUsers());
    }
}
