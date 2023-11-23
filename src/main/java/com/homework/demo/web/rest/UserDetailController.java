package com.homework.demo.web.rest;

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
        if (userDetail.getId() != null) {
            throw new IllegalArgumentException(
                    "A user  is been created with this userId, please review the  request body");
        }

        return ResponseEntity.created(
                new URI("/v1/users" + userDetail.getId())).body(userDetailServices.createUserDetail(userDetail));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UserDetailDTO> updateUserDetail(@PathVariable("id") Integer userDetailId,
                                                          @RequestBody UserDetailDTO userDetail) {
        return null;
    }

    @DeleteMapping(path = "/delete/{id}")
    public Long deleteUserDetail(@PathVariable("id") Long userDetailId) {
        userDetailServices.deleteUserDetail(userDetailId);
        return userDetailId;
    }

}
