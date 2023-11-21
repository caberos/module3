package com.homework.demo.web.rest;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.services.UserDetailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/userRol")
public class UserRolController {

    private final UserDetailServices userDetailServices;

    public UserRolController(UserDetailServices userDetailServices) {
        this.userDetailServices = userDetailServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<UserDetail>> getAllUsersRol() {
        return ResponseEntity.ok().body(userDetailServices.listUserDetails());
    }

    @GetMapping(path = "/getUser/{id}")
    public void getUserRol(@PathVariable("id") Integer userRolId) {
    }

    @PostMapping(path = "/create")
    public void createUser(@RequestBody UserRol userRol) {
    }

    @PutMapping(path = "/update/{id}")
    public void updateUserRol(@PathVariable("id") Integer userIdRol, @RequestBody UserRol userRol) {
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUserRol(@PathVariable("id") Integer userIdRol) {
    }
}
