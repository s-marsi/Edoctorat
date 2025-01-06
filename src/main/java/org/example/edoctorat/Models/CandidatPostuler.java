package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class CandidatPostuler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pathFile;
    // private int candidat_id;
    // private int sujet_id;

    //! RELATION MANY-TO-ONE : Une candidature appartient à un seul candidat
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;

    //! RELATION MANY-TO-ONE : Une candidature est pour un seul sujet
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;

    /*//! RELATION MANY-TO-ONE : Un candidat postule à un sujet
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;*/
}
