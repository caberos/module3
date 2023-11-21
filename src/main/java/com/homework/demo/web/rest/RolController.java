package com.homework.demo.web.rest;


import com.homework.demo.domain.entities.Rol;
import com.homework.demo.services.RolServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/rol")
public class RolController {

    private final RolServices rolServices;

    public RolController(RolServices rolServices) {
        this.rolServices = rolServices;
    }

    @GetMapping(path = "/getAllObjects")
    public ResponseEntity<List<Rol>> getAllRol() {
        return ResponseEntity.ok().body(rolServices.listRol());
    }

    @GetMapping(path = "/get/{id}")
    public void getRol(@PathVariable("id") Integer RolId) {
    }

    @PostMapping(path = "/create")
    public void createRol(@RequestBody Rol rol) {
    }

    @PutMapping(path = "/update/{id}")
    public void updateRol(@PathVariable("id") Integer rolId, @RequestBody Rol rol) {
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteRol(@PathVariable("id") Integer rolId) {
    }

}