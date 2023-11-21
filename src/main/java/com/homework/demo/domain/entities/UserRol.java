package com.homework.demo.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_rol")
public class UserRol {

    @Id
    @SequenceGenerator(name = "user_rol_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_rol_sequence")
    private Integer id;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP")
    private LocalDateTime create_at;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User userId;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "rol_id")
    private User rolId;

    public UserRol(Integer id, Boolean active, LocalDateTime create_at, User userId, User rolId) {
        this.id = id;
        this.active = active;
        this.create_at = create_at;
        this.userId = userId;
        this.rolId = rolId;
    }

    public UserRol() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreate_at() {
        return create_at;
    }

    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public User getRolId() {
        return rolId;
    }

    public void setRolId(User rolId) {
        this.rolId = rolId;
    }
}
