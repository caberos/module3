package com.homework.demo.web.rest;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.services.UserDetailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/userDetail")
public class UserDetailController {

    private final UserDetailServices userDetailServices;

    public UserDetailController(UserDetailServices userDetailServices) {
        this.userDetailServices = userDetailServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<UserDetail>> getAllUserDetails() {
        return ResponseEntity.ok().body(userDetailServices.listUserDetails());
    }

    @GetMapping(path = "/get/{id}")
    public void getUserDetails(@PathVariable("id") Integer userDetailId) {
    }

    @PostMapping(path = "/create")
    public void createUserDetail(@RequestBody UserDetail userDetail) {
    }

    @PutMapping(path = "/update/{id}")
    public void updateUserDetail(@PathVariable("id") Integer userDetailId, @RequestBody UserDetail userDetail) {
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserDetail(@PathVariable("id") Integer userDetailId) {
    }

}
