package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class CandidatPays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    //! RELATION ONE-TO-MANY : Un pays peut être associé à plusieurs candidats
    @OneToMany(mappedBy = "pays", cascade = CascadeType.ALL)
    private Set<CandidatCandidat> candidats = new HashSet<>();

}
