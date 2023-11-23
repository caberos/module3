package com.homework.demo.services;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.dto.UserRolDTO;

import java.util.List;
import java.util.Optional;

public interface UserRolServices {
    List<UserRolDTO> listUserRol();

    UserRolDTO getUserRol(Integer id);

    UserRolDTO createUserRol(UserRolDTO userRol);

    UserRolDTO updateUserRol(Integer id, UserRolDTO userRol);

    Integer deleteUserRol(Integer id);

    boolean setActive(Integer id);
}
