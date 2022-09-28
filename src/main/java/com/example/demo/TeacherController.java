package com.example.demo;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"1-教师管理", "3-教学管理"})
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @GetMapping("/xxx")
    public String xxx() {
        return "xxx";
    }
}
