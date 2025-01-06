package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class AuthGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    //! RELATION MANY-TO-MANY : Un groupe peut contenir plusieurs utilisateurs
    @ManyToMany(mappedBy = "groups")
    private Set<AuthUser> users = new HashSet<>();

    //! RELATION MANY-TO-MANY : Un groupe peut avoir plusieurs permissions via l'entité associée
    @ManyToMany
    @JoinTable(
            name = "auth_group_permissions",
            joinColumns = @JoinColumn(name = "group_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<AuthPermission> permissions = new HashSet<>();


}
