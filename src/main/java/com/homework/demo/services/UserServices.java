package com.homework.demo.services;

import com.homework.demo.domain.entities.User;
import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserServices {

    List<UserDTO> listUsers();

    UserDTO getUser(Long id);

    UserDTO createUser(UserDTO user);

    UserDTO updateUser(Long id, UserDTO user);

    Integer deleteUser(Integer id);
}
