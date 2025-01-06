package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;


@Entity
@Data
public class ProfesseurProfesseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String cin;
    private String telProfesseur;
    private String pathPhoto;
    private String grade;
    private String numSOM;
    private int nombreEncadrer;
    private int nombreProposer;
    private String etablissement_id;
    private int labo_id;
    private int user_id;

    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    ProfesseurProfesseur professeur;

    @OneToMany(mappedBy = "professeur_professeur", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<ProfesseurSujet> professeurSujet;

//    @ManyToMany(mappedBy = "professeur_professeur")
//    private ArrayList<ProfesseurCommission> professeurCommission;
    @OneToMany(mappedBy = "candidat_candidat", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<ProfesseurLaboratoire> professeurLaboratoire;

}
