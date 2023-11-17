package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //save는 포스트야, 그리고 api처럼 받는방법이잇는데, 그거는 @RequestBody "/{id}"
    @GetMapping("/save")
    public User createUser(@RequestParam("name") String name, @RequestParam("id") String id, @RequestParam("password") String password,
                           @RequestParam("department") String department) {
        User user = new User(id, password, name, department);
        return userService.createUser(user);
    }

    @GetMapping("/findall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/findbyid")
    public User getUserById(@RequestParam("id") String id)
    {
        return userService.getUserById(id);
    }

    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam("id") String id)
    {
        userService.deleteUserById(id);
    }


}
