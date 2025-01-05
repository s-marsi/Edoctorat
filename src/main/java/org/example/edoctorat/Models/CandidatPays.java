package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;


@Entity
@Data
public class CandidatPays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;

    @OneToMany(mappedBy = "candidat_pays", cascade = CascadeType.ALL, orphanRemoval = true)
    ArrayList<CandidatCandidat> candidats = new ArrayList<>();

}
