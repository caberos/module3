package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.repositories.UserRolRepository;
import com.homework.demo.services.UserRolServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserRolServicesImplement implements UserRolServices {

    private final UserRolRepository userRolRepository;

    public UserRolServicesImplement(UserRolRepository userRolRepository) {
        this.userRolRepository = userRolRepository;
    }

    @Override
    public List<UserRol> listUserRol() {
        return userRolRepository.findAll();
    }

    @Override
    public Optional<UserRol> getUserRol(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserRol> createUserRol(UserRol userRol) {
        return Optional.empty();
    }

    @Override
    public Optional<UserRol> updateUserRol(Integer id, UserRol userRol) {
        return Optional.empty();
    }

    @Override
    public Optional<UserRol> deleteUserRol(Integer id) {
        return Optional.empty();
    }
}
