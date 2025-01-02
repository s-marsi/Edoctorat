package com.openclassrooms.edoctorat.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "auth_user_permissions")
@Data
public class AuthUserPermissionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 20)
    private long id;
    @Column(nullable = false)
    private int user_id;
    @Column(nullable = false)
    private int permission_id;
}