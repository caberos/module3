package com.homework.demo.web.rest.controller;

import com.homework.demo.domain.entities.User;
import com.homework.demo.dto.UserDTO;
import com.homework.demo.services.UserServices;
import com.homework.demo.web.rest.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        return ResponseEntity.ok().body(userServices.listUsers());
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable("id") Long userId) {
        return ResponseEntity.ok().body(userServices.getUser(userId));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO user) throws URISyntaxException {
        if(user == null){
            throw new ApiRequestException("Invalid input data. Please check the provided information.");
        }
        return ResponseEntity.created(null).body(userServices.createUser(user));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable("id") Long userId,@Valid @RequestBody UserDTO user) {
        return ResponseEntity.ok().body(userServices.updateUser(userId, user));
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Integer> deleteUser(@PathVariable("id") Integer userId) {
        return ResponseEntity.status(HttpStatus.OK).body(userServices.deleteUser(userId));
    }


}
