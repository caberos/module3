package com.homework.demo.services.mapper;

import com.homework.demo.domain.entities.Rol;
import com.homework.demo.dto.RolDTO;
import org.springframework.stereotype.Component;

@Component
public class RolMapper implements CustomMapper <RolDTO, Rol>{

    @Override
    public RolDTO toDto(Rol rol) {
        RolDTO rolDTO = new RolDTO();
        rolDTO.setName(rol.getName());
        rolDTO.setId(rol.getId());
        return rolDTO;
    }

    @Override
    public Rol toEntity(RolDTO rolDTO) {
        Rol rol = new Rol();
        rol.setId(rolDTO.getId());
        rol.setName(rolDTO.getName());
        return rol;
    }
}
