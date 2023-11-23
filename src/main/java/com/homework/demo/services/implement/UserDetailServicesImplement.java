package com.homework.demo.services.implement;

import com.homework.demo.domain.entities.UserDetail;
import com.homework.demo.dto.UserDetailDTO;
import com.homework.demo.repositories.UserDetailRepository;
import com.homework.demo.services.UserDetailServices;
import com.homework.demo.services.mapper.UserDetailMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDetailServicesImplement implements UserDetailServices {

    private final UserDetailRepository userDetailRepository;
    private final UserDetailMapper userDetailMapper;

    public UserDetailServicesImplement(UserDetailRepository userDetailRepository,
                                       UserDetailMapper userDetailMapper) {
        this.userDetailRepository = userDetailRepository;
        this.userDetailMapper = userDetailMapper;
    }

    @Override
    public List<UserDetailDTO> listUserDetails() {
        return userDetailRepository.findAll()
                .stream()
                .map(userDetailMapper::toDto).collect(Collectors.toList());
    }

    @Override
    public UserDetailDTO getUserDetail(Long id) {
        List<UserDetail> listUserDetail = userDetailRepository.findAll();
        UserDetail res = new UserDetail();
        for (UserDetail aux : listUserDetail) {
            if (aux.getId() == id) {
                res=aux;
                break;
            }
        }
        return this.userDetailMapper.toDto(res);
    }

    @Override
    public UserDetailDTO createUserDetail(UserDetailDTO userDetail) {
        return this.userDetailMapper.toDto(
                userDetailRepository.save(this.userDetailMapper.toEntity(userDetail)));
    }

    @Override
    public UserDetailDTO updateUserDetail(Long id, UserDetailDTO userDetail) {
        UserDetail userDetailRes = userDetailRepository.getReferenceById(id);
        userDetailRes.setFirstName(userDetail.getFirstName());
        userDetailRes.setLastName(userDetail.getLastName());
        userDetailRes.setAge(userDetail.getAge());
        userDetailRes.setBirthday(userDetail.getBirthday());
        userDetailRes.setUserId(userDetail.getUser());
        userDetailRepository.save(userDetailRes);
        return this.userDetailMapper.toDto(userDetailRes);
    }

    @Override
    public Long deleteUserDetail(Long id) {
        userDetailRepository.deleteById(id);
        return id;
    }
}
