package com.openclassrooms.edoctorat.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity(name = "User")
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String first_name;
    private String last_name;
    private String username;
    private String email;
    private String password;
    private String is_superuser;
    private String is_staff;
    private String is_active;
    private LocalDateTime date_joined;
    private LocalDateTime last_login;


}

