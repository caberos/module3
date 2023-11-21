package com.homework.demo.web.rest;

import com.homework.demo.domain.entities.User;
import com.homework.demo.services.UserServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userServices.listUsers());
    }

    @GetMapping(path = "/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Integer userId) {
        User user = new User();
        return null;
    }

    @PostMapping(path = "/createUser")
    public void createUser(@RequestBody User user) {
    }

    @PutMapping(path = "/updateUser/{id}")
    public void updateUser(@PathVariable("id") Integer userId, @RequestBody User user) {
    }

    @DeleteMapping(path = "/deleteUser/{id}")
    public void deleteUser(@PathVariable("id") Integer userId) {
    }


}
