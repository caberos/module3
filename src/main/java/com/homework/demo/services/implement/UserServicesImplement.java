package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.User;
import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.dto.UserDTO;
import com.homework.demo.repositories.UserRepository;
import com.homework.demo.services.UserServices;
import com.homework.demo.services.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServicesImplement implements UserServices {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServicesImplement(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDTO> listUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public UserDTO getUser(Long id) {
        List<User> listUser = userRepository.findAll();
        User res = new User();
        for (User aux : listUser) {
            if (aux.getId() == id) {
                res=aux;
                break;
            }
        }
        return this.userMapper.toDto(res);
    }

    @Override
    public UserDTO createUser(UserDTO user) {
        return this.userMapper.toDto(
                userRepository.save(this.userMapper.toEntity(user)));
    }

    @Override
    public UserDTO updateUser(Long id, UserDTO user) {
        User userRes = userRepository.getReferenceById(id);
        userRes.setUserName(user.getUserName());
        userRes.setPassword(user.getPassword());
        userRes.setId(user.getId());
        userRes.setCreateAt(user.getCreateAt());
        userRes.setEmail(user.getEmail());
        userRepository.save(userRes);
        return this.userMapper.toDto(userRes);
    }

    @Override
    public Integer deleteUser(Integer id) {
        userRepository.deleteById(Long.valueOf(id));
        return id;
    }
}
