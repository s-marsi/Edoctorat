package com.openclassrooms.edoctorat.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "auth_permission")
@Data
public class AuthPermissionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int contentTypeId;
    @Column(nullable = false, length = 100)
    private String codename;
}
