package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class AuthPermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int content_type_id;
    private String codename;

    //! RELATION MANY-TO-MANY : Une permission peut être attribuée à plusieurs utilisateurs
    @ManyToMany(mappedBy = "permissions")
    private Set<AuthUser> users = new HashSet<>();

    //! RELATION MANY-TO-MANY : Une permission peut être attribuée à plusieurs groupes via l'entité associée
    @ManyToMany(mappedBy = "permissions")
    private Set<AuthGroup> groups = new HashSet<>();
}
