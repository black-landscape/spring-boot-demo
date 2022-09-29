package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Data
@AllArgsConstructor
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public int create(@RequestBody User user) {
        return userService.create(user.getName(), user.getAge());
    }

    @GetMapping("/getByName")
    public List<User> getByName(@PathVariable String name) {
        return userService.getByName(name);
    }

    @DeleteMapping("/deleteByName")
    public int deleteByName(@PathVariable String name) {
        return userService.deleteByName(name);
    }

    @GetMapping("/getAllUsers")
    public int getAllUsers() {
        return userService.getAllUsers();
    }

    @DeleteMapping("/deleteAllUsers")
    public int deleteAllUsers() {
        return userService.deleteAllUsers();
    }
}
