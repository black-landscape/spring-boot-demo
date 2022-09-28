package com.example.demo.primary;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserPrimary {
    private Long id;
    private String name;
    private Integer age;

    public UserPrimary(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}