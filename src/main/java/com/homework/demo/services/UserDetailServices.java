package com.homework.demo.services;

import com.homework.demo.domain.entities.UserDetail;

import java.util.List;
import java.util.Optional;

public interface UserDetailServices {

    List<UserDetail> listUserDetails();

    Optional<UserDetail> getUserDetail(Long id);

    Optional<UserDetail> createUserDetail(UserDetail userDetail);

    Optional<UserDetail> updateUserDetail(Long id, UserDetail userDetail);

    Optional<UserDetail> deleteUserDetail(Long id);
}
