package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class ProfesseurLaboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomLaboratoire;
    private String description;
    private String pathImage;
    private String initial;
    private int ced_id;
    private int directeur_id;
    private String etablissement_id;

    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private ProfesseurProfesseur directeur;
}
