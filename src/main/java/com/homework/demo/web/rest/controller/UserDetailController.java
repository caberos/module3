package com.homework.demo.web.rest.controller;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.dto.UserDetailDTO;
import com.homework.demo.services.UserDetailServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("v1/userDetail")
public class UserDetailController {

    private final UserDetailServices userDetailServices;

    public UserDetailController(UserDetailServices userDetailServices) {
        this.userDetailServices = userDetailServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<UserDetailDTO>> getAllUserDetails() {
        return ResponseEntity.ok().body(userDetailServices.listUserDetails());
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserDetailDTO> getUserDetails(@PathVariable("id") Long userDetailId) {
       return ResponseEntity.ok().body(userDetailServices.getUserDetail(userDetailId));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<UserDetailDTO> createUserDetail(@RequestBody UserDetailDTO userDetail) throws URISyntaxException {
        return ResponseEntity.created(null).body(userDetailServices.createUserDetail(userDetail));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UserDetailDTO> updateUserDetail(@PathVariable("id") Long userDetailId,
                                                          @RequestBody UserDetailDTO userDetail) {
        return ResponseEntity.ok().body(userDetailServices.updateUserDetail(userDetailId, userDetail));
    }

    @DeleteMapping(path = "/delete/{id}")
    public Long deleteUserDetail(@PathVariable("id") Long userDetailId) {
        userDetailServices.deleteUserDetail(userDetailId);
        return userDetailId;
    }

}
