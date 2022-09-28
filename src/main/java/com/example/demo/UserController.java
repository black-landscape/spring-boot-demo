package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@Data
@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/users")
public class UserController {
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ApiOperation(value = "获取用户列表")
    public List<User> getUserList() {
        List<User> r = new ArrayList<User>(users.values());
        return r;
    }

    @PostMapping("/")
    @ApiOperation(value = "创建用户", notes = "根据User对象创建用户")
    public String postUser(@Valid @RequestBody User user) {
        users.put(user.getId(), user);
        return "success";
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    public User getUser(@PathVariable Long id) {
        return users.get(id);
    }

    @PutMapping("/{id}")
    @ApiImplicitParam(paramType = "path", dataType = "Long", name = "id", value = "用户编号", required = true, example = "1")
    @ApiOperation(value = "更新用户详细信息", notes = "根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    public String putUser(@PathVariable Long id, @RequestBody User user) {
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id, u);

        return "success";
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "删除用户", notes = "根据url的id来指定删除对象")
    public String deleteUser(@PathVariable Long id) {
        users.remove(id);
        return "success";
    }

    @PostMapping(value = "/createXml",
            consumes = MediaType.APPLICATION_XML_VALUE,
            produces = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public User createXml(@RequestBody User user) {
        user.setName("xml tester: " + user.getName());
        user.setAge(user.getAge() + 100);
        return user;
    }

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
        int count = userService.getAllUsers();
        return count;
    }

    @DeleteMapping("/deleteAllUsers")
    public int deleteAllUsers() {
        return userService.deleteAllUsers();
    }
}
