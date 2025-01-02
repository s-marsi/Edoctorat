package com.openclassrooms.edoctorat.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity(name = "auth_user")
public class AuthUserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 128)
    private String password;

    @Column(nullable = false, length = 150)
    private String username;
    @Column(nullable = false, length = 150)
    private String firstName;
    @Column(nullable = false, length = 150)
    private String lastName;

    @Column(nullable = false, length = 245)
    private String email;

    @Column(nullable = false)
    private boolean is_superuser;
    @Column(nullable = false)
    private boolean is_staff;
    @Column(nullable = false)
    private boolean is_active;

    @Column(length = 6, columnDefinition = "DATE")
    private LocalDate dataJoined;
    @Column(length = 6)
    private LocalDate lastLogin;
}
