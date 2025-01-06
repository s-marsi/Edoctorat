package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


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

    //! RELATION MANY-TO-MANY : Un utilisateur peut appartenir à plusieurs groupes
    @ManyToMany
    @JoinTable(
            name = "auth_user_groups",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id")
    )
    private Set<AuthGroup> groups = new HashSet<>();

    //! RELATION MANY-TO-MANY : Un utilisateur peut avoir plusieurs permissions
    @ManyToMany
    @JoinTable(
            name = "auth_user_user_permissions",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id")
    )
    private Set<AuthPermission> permissions = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un utilisateur peut avoir plusieurs candidatures
    @OneToMany(mappedBy = "user")
    private Set<CandidatCandidat> candidatures = new HashSet<>();

    //! RELATION ONE-TO-ONE : Un utilisateur peut être un professeur
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private ProfesseurProfesseur professeur;


    /*//! RELATION ONE-TO-MANY : Un utilisateur peut avoir plusieurs candidatures
    @OneToMany(mappedBy = "user") // mappedBy indique que la relation est définie dans CandidatCandidat
    private Set<CandidatCandidat> candidats = new HashSet<>();*/

    /*//! RELATION ONE-TO-ONE : Chaque utilisateur peut être un candidat
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private CandidatCandidat candidat;*/


    /*//! RELATION ONE-TO-MANY : Un utilisateur peut avoir plusieurs inscriptions
    @ManyToOne
    @JoinColumn(name = "candidat_id", nullable = false)
    private CandidatCandidat candidat;*/





}
