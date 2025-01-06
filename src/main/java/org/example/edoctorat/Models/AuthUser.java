package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String password;
    private Date last_login;
    private int is_superuser;
    private String username;
    private String first_name;
    private String last_name;
    private String email;
    private boolean is_staff;
    private boolean is_active;
    private Date date_joined;
}
