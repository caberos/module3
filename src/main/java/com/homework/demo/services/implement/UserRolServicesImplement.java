package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.dto.UserRolDTO;
import com.homework.demo.repositories.UserRolRepository;
import com.homework.demo.services.UserRolServices;
import com.homework.demo.services.mapper.UserRolMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserRolServicesImplement implements UserRolServices {

    private final UserRolRepository userRolRepository;
    private final UserRolMapper userRolMapper;

    public UserRolServicesImplement(UserRolRepository userRolRepository, UserRolMapper userRolMapper) {
        this.userRolRepository = userRolRepository;
        this.userRolMapper = userRolMapper;
    }

    @Override
    public List<UserRolDTO> listUserRol() {
        return userRolRepository.findAll().stream()
                .map(userRolMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public UserRolDTO getUserRol(Integer id) {
        List<UserRol> listUserRol = userRolRepository.findAll();
        UserRol res = new UserRol();
        for (UserRol aux : listUserRol) {
            if (aux.getId() == id) {
                res=aux;
                break;
            }
        }
        return this.userRolMapper.toDto(res);
    }

    @Override
    public UserRolDTO createUserRol(UserRolDTO userRol) {
        return this.userRolMapper.toDto(userRolRepository.save(this.userRolMapper.toEntity(userRol)));
    }

    @Override
    public UserRolDTO updateUserRol(Integer id, UserRolDTO userRol) {
        UserRol userRolRes = userRolRepository.getReferenceById(id);
        userRolRes.setRolId(userRol.getRolId());
        userRolRes.setUserId(userRol.getUserId());
        userRolRes.setActive(userRol.getActive());
        userRolRepository.save(userRolRes);
        return this.userRolMapper.toDto(userRolRes);
    }

    @Override
    public Integer deleteUserRol(Integer id) {
        userRolRepository.deleteById(id);
        return id;
    }
}
