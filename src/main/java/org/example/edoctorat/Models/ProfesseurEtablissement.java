package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;


@Entity
@Data
public class ProfesseurEtablissement {
    @Id
    private String idEtablissement;
    private String nomEtablissement;

    @OneToMany(mappedBy = "professeur_etablissement", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<ProfesseurProfesseur> professeur;
}
