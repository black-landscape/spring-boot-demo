package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {
    private JdbcTemplate primaryJdbcTemplate;
    private JdbcTemplate secondaryJdbcTemplate;

    public TestService(JdbcTemplate primaryJdbcTemplate, JdbcTemplate secondaryJdbcTemplate) {
        this.primaryJdbcTemplate = primaryJdbcTemplate;
        this.secondaryJdbcTemplate = secondaryJdbcTemplate;
    }

    @Transactional
    public void tx() {
        primaryJdbcTemplate.update("update user set age = ? where name = ?", 30, "aaa");
        secondaryJdbcTemplate.update("update user set age = ? where name = ?", 30, "aaa");
    }

    @Transactional
    public void tx2() {
        primaryJdbcTemplate.update("update user set age = ? where name = ?", 40, "aaa");
        throw new RuntimeException();
    }
}
