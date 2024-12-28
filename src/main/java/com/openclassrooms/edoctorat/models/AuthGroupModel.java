package com.openclassrooms.edoctorat.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "auth_group")
@Data
public class AuthGroupModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
}
