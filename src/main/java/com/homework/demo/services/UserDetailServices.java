package com.homework.demo.services;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.dto.UserDetailDTO;

import java.util.List;
import java.util.Optional;

public interface UserDetailServices {

    List<UserDetailDTO> listUserDetails();

    UserDetailDTO getUserDetail(Long id);

    UserDetailDTO createUserDetail(UserDetailDTO userDetail);

    UserDetailDTO updateUserDetail(Long id, UserDetailDTO userDetail);

    Long deleteUserDetail(Long id);
}
