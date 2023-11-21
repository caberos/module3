package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.User;
import com.homework.demo.repositories.UserRepository;
import com.homework.demo.services.UserServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImplement implements UserServices {

    private final UserRepository userRepository;

    public UserServicesImplement(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> createUser(User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> updateUser(Integer id, User user) {
        return Optional.empty();
    }

    @Override
    public Optional<User> deleteUser(Integer id) {
        return Optional.empty();
    }
}
