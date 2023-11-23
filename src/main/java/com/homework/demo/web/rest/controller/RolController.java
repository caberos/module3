package com.homework.demo.web.rest.controller;

import com.homework.demo.dto.RolDTO;
import com.homework.demo.services.RolServices;
import com.homework.demo.web.rest.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("v1/rol")
public class RolController {

    private final RolServices rolServices;

    public RolController(RolServices rolServices) {
        this.rolServices = rolServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<com.homework.demo.dto.RolDTO>> getAllRol() {
        return ResponseEntity.ok().body(rolServices.listRol());
    }

    @GetMapping(path = "/get/{id}")
    public RolDTO getRol(@PathVariable("id") Integer rolId) {
        return rolServices.getRol(rolId);
    }

    @PostMapping(path = "/create")
    public ResponseEntity<RolDTO> createRol(@Valid @RequestBody RolDTO rolDTO) throws URISyntaxException {
        if(rolDTO == null){
            throw new ApiRequestException("Invalid input data. Please check the provided information.");
        }
        return ResponseEntity.created(null).body(rolServices.createRol(rolDTO));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<RolDTO> updateRol(@PathVariable("id") Integer rolId, @RequestBody RolDTO rol) {
        if(rol == null){
            throw new ApiRequestException("Invalid input data. Please check the provided information.");
        }
        return ResponseEntity.ok().body(rolServices.updateRol(rolId, rol));
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Integer> deleteRol(@PathVariable("id") Integer rolId) {
        rolServices.deleteRol(rolId);
        return ResponseEntity.status(HttpStatus.OK).body(rolId);
    }

}