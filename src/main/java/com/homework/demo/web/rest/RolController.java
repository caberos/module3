package com.homework.demo.web.rest;

import com.homework.demo.dto.RolDTO;
import com.homework.demo.services.RolServices;
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
    public ResponseEntity<RolDTO> createRol(@RequestBody RolDTO rolDTO) throws URISyntaxException {
        if (rolDTO.getId() == null) {
            throw new IllegalArgumentException(
                    "A Rol is been created with this rolId, please review the  request body");
        }

        return ResponseEntity.created(
                        new URI("/v1/listRol" + rolDTO.getId()))
                .body(rolServices.createRol(rolDTO));
    }

    @PutMapping(path = "/update/{id}")
    public ResponseEntity<RolDTO> updateRol(@PathVariable("id") Integer rolId, @RequestBody RolDTO rol) {
        return ResponseEntity.ok().body(rolServices.updateRol(rolId, rol));
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Integer> deleteRol(@PathVariable("id") Integer rolId) {
        rolServices.deleteRol(rolId);
        return ResponseEntity.status(HttpStatus.OK).body(rolId);
    }

}