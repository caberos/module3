package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.repositories.UserDetailRepository;
import com.homework.demo.services.UserDetailServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailServicesImplement implements UserDetailServices {

    private final UserDetailRepository userDetailRepository;

    public UserDetailServicesImplement(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    @Override
    public List<UserDetail> listUserDetails() {
        return userDetailRepository.findAll();
    }

    @Override
    public Optional<UserDetail> getUserDetail(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDetail> createUserDetail(UserDetail userDetail) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDetail> updateUserDetail(Long id, UserDetail userDetail) {
        return Optional.empty();
    }

    @Override
    public Optional<UserDetail> deleteUserDetail(Long id) {
        return Optional.empty();
    }
}
