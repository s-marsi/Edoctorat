package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class AuthGroupPersmissions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // private int group_id;
    // private int permission_id;

    //! RELATION MANY-TO-ONE : AuthGroup référencé par cette association
    @ManyToOne
    @JoinColumn(name = "group_id")
    private AuthGroup authGroup;

    //! RELATION MANY-TO-ONE : AuthPermission référencé par cette association
    @ManyToOne
    @JoinColumn(name = "permission_id")
    private AuthPermission authPermission;


}
