package com.homework.demo.services;

import com.homework.demo.domain.entities.Rol;
import com.homework.demo.dto.RolDTO;

import java.util.List;

public interface RolServices {

    List<RolDTO> listRol();


    RolDTO getRol(Integer id);

    RolDTO createRol(RolDTO rol);

    RolDTO updateRol(Integer id, RolDTO rol);

    Integer deleteRol(Integer id);
}
