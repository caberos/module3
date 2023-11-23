package com.homework.demo.dto;

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
public class UserDetailDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private Integer age;
    private LocalDateTime birthday;
    private User user;
}
