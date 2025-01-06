package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProfesseurSujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    private int coDirecteur_id;
    private int formationDoctorale_id;
    private int professeur_id;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private ProfesseurProfesseur professeur;
}
