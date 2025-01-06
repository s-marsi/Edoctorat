package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class ProfesseurExaminer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String decision;
    private float noteDossier;
    private int noteEntretien;
    private int publier;
    // private int commission_id;
    // private int sujet_id;
    // private int candidat_id;
    private int valider;

    //! RELATION MANY-TO-ONE : Un examen appartient à une commission
    @ManyToOne
    @JoinColumn(name = "commission_id")
    private ProfesseurCommission commission;

    //! RELATION MANY-TO-ONE : Un examiner est lié à un sujet
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;

    //! RELATION MANY-TO-ONE : Un professeur examine un seul candidat
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;

}
