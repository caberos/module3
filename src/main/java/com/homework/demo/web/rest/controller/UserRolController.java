package com.homework.demo.web.rest.controller;

import com.homework.demo.dto.UserRolDTO;
import com.homework.demo.services.UserRolServices;
import com.homework.demo.services.mapper.UserRolMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/v1/userRol")
public class UserRolController {

    private final UserRolServices userRolServices;
    private final UserRolMapper userRolMapper;

    public UserRolController(UserRolServices userRolServices, UserRolMapper userRolMapper) {
        this.userRolServices = userRolServices;
        this.userRolMapper = userRolMapper;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<UserRolDTO>> getAllUsersRol() {
        return ResponseEntity.ok().body(userRolServices.listUserRol());
    }

    @GetMapping(path = "/get/{id}")
    public ResponseEntity<UserRolDTO> getUserRol(@PathVariable("id") Integer userRolId) {
        return ResponseEntity.ok().body(userRolServices.getUserRol(userRolId));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<UserRolDTO> createRolUser(@RequestBody UserRolDTO userRol) throws URISyntaxException {
        return ResponseEntity.created(null).body(userRolServices.createUserRol(userRol));
    }


    @PutMapping(path = "/update/{id}")
    public ResponseEntity<UserRolDTO> updateUserRol(@PathVariable("id") Integer userIdRol, @RequestBody UserRolDTO userRol) {
        return ResponseEntity.ok().body(userRolServices.updateUserRol(userIdRol, userRol));
    }

    @DeleteMapping(path = "/delete/{id}")
    public Integer deleteUserRol(@PathVariable("id") Integer userIdRol) {
        userRolServices.deleteUserRol(userIdRol);
        return userIdRol;
    }

    @PatchMapping(path = "/active/{id}")
    public boolean setActive(@PathVariable("id")Integer userIdRol){
        return userRolServices.setActive(userIdRol);
    }


}
