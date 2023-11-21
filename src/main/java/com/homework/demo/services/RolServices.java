package com.homework.demo.services;

import com.homework.demo.domain.entities.Rol;
import com.homework.demo.domain.entities.UserDetail;
import org.springframework.data.relational.core.sql.In;

import java.util.List;
import java.util.Optional;

public interface RolServices {

    List<Rol> listRol();


    Optional<Rol> getRol(Integer id);

    Optional<Rol> createRol(Rol rol);

    Optional<Rol> updateRol(Integer id, Rol rol);

    Optional<Rol> deleteRol(Integer id);
}
