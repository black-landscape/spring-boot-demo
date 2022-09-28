package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = {"2-学生管理"})
@RestController
@RequestMapping("/student")
public class StudentController {
    @ApiOperation(value = "获取学生清单", tags = "3-教学管理")
    @GetMapping("/list")
    public String getStudentList() {
        return "学生清单";
    }

    @ApiOperation("获取教某个学生的老师清单")
    @GetMapping("/his-teachers")
    public String getStudentTeachers() {
        return "教某个学生的老师清单";
    }

    @ApiOperation("创建一个学生")
    @PostMapping("/create")
    public String createStudent() {
        return "创建一个学生";
    }
}
