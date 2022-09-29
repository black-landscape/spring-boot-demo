package com.example.demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTests {
    @Autowired
    protected JdbcTemplate primaryJdbcTemplate;
    @Autowired
    protected JdbcTemplate secondaryJdbcTemplate;

    @Autowired
    @Before
    public void setUp() {
        primaryJdbcTemplate.update("DELETE FROM USER");
        secondaryJdbcTemplate.update("DELETE FROM USER");
    }

    @Test
    public void test() throws Exception {
        primaryJdbcTemplate.update("INSERT INTO USER(name,age) VALUES(?, ?)", "aaa", 20);
        primaryJdbcTemplate.update("INSERT INTO USER(name,age) VALUES(?, ?)", "bbb", 30);

        secondaryJdbcTemplate.update("INSERT INTO USER(name,age) VALUES(?, ?)", "ccc", 20);

        Assert.assertEquals("2", primaryJdbcTemplate.queryForObject("SELECT count(1) FROM USER", String.class));
        Assert.assertEquals("1", secondaryJdbcTemplate.queryForObject("SELECT count(1) FROM USER", String.class));
    }
}
