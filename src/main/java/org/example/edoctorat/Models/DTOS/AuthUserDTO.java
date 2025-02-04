package org.example.edoctorat.Models.DTOS;

import lombok.Data;
import lombok.Value;

import java.util.Date;

@Value
public class AuthUserDTO {
    Date last_login;
    int is_superuser;
    String username;
    String first_name;
    String last_name;
    String email;
    boolean is_staff;
    boolean is_active;
    Date date_joined;
}
