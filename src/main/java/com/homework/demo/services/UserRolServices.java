package com.homework.demo.services;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.domain.entities.UserRol;

import java.util.List;
import java.util.Optional;

public interface UserRolServices {
    List<UserRol> listUserRol();

    Optional<UserRol> getUserRol(Integer id);

    Optional<UserRol> createUserRol(UserRol userRol);

    Optional<UserRol> updateUserRol(Integer id, UserRol userRol);

    Optional<UserRol> deleteUserRol(Integer id);
}
