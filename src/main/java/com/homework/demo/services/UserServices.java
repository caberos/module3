package com.homework.demo.services;

import com.homework.demo.domain.entities.User;
import com.homework.demo.domain.entities.UserDetail;

import java.util.List;
import java.util.Optional;

public interface UserServices {

    List<User> listUsers();

    Optional<User> getUser(Integer id);

    Optional<User> createUser(User user);

    Optional<User> updateUser(Integer id, User user);

    Optional<User> deleteUser(Integer id);
}
