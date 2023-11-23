package com.homework.demo.dto;

import com.homework.demo.domain.entities.Rol;
import com.homework.demo.domain.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRolDTO {
    private Integer id;
    private Boolean active;
    private LocalDateTime createAt;
    private User userId;
    private Rol rolId;
}