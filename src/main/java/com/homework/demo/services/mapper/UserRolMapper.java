package com.homework.demo.services.mapper;

import com.homework.demo.domain.entities.UserRol;
import com.homework.demo.dto.UserRolDTO;
import org.springframework.stereotype.Component;

@Component
public class UserRolMapper implements CustomMapper<UserRolDTO, UserRol>{

    @Override
    public UserRolDTO toDto(UserRol userRol) {
        UserRolDTO userRolDTO = new UserRolDTO();
        userRolDTO.setId(userRol.getId());
        userRolDTO.setActive(userRol.getActive());
        userRolDTO.setUserId(userRol.getUser());
        userRolDTO.setRolId(userRol.getRol());
        userRolDTO.setCreateAt(userRol.getCreate_at());
        return userRolDTO;
    }

    @Override
    public UserRol toEntity(UserRolDTO userRolDTO) {
        UserRol userRol = new UserRol();
        userRol.setId(userRolDTO.getId());
        userRol.setActive(userRolDTO.getActive());
        userRol.setUser(userRolDTO.getUserId());
        userRol.setRol(userRolDTO.getRolId());
        userRol.setCreate_at(userRolDTO.getCreateAt());
        return userRol;
    }
}
