package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestServiceTests {
    @Autowired
    protected JdbcTemplate primaryJdbcTemplate;

    @Autowired
    protected JdbcTemplate secondaryJdbcTemplate;

    @Autowired
    private TestService testService;

    @Test
    public void test1() throws Exception {
        testService.tx();
        Assert.assertEquals(30, primaryJdbcTemplate.queryForObject("select age from user where name = ?", Integer.class, "aaa").intValue());
        Assert.assertEquals(30, secondaryJdbcTemplate.queryForObject("select age from user where name = ?", Integer.class, "aaa").intValue());
    }

    public void test2() throws Exception {
        try {
            testService.tx2();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Assert.assertEquals(30, primaryJdbcTemplate.queryForObject("select age from user where name = ?", Integer.class, "aaa").intValue());
            Assert.assertEquals(30, secondaryJdbcTemplate.queryForObject("select age from user where name = ?", Integer.class, "aaa").intValue());
        }
    }
}
