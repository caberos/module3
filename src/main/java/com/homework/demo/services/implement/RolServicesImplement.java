package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.Rol;
import com.homework.demo.repositories.RolRepository;
import com.homework.demo.services.RolServices;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolServicesImplement implements RolServices {

    private final RolRepository rolRepository;

    public RolServicesImplement(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public List<Rol> listRol() {
        return rolRepository.findAll();
    }

    @Override
    public Optional<Rol> getRol(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Rol> createRol(Rol rol) {
        return Optional.empty();
    }

    @Override
    public Optional<Rol> updateRol(Integer id, Rol rol) {
        return Optional.empty();
    }

    @Override
    public Optional<Rol> deleteRol(Integer id) {
        return Optional.empty();
    }
}
