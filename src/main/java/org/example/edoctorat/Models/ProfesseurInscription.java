package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateDiposeDossier;
    private String remarque;
    private int valider;
    // private int candidat_id;
    // private int sujet_id;

    //! RELATION ONE-TO-ONE : Une inscription appartient à un seul candidat
    @OneToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;

    /*//! RELATION ONE-TO-ONE : Une inscription concerne un seul sujet
    @OneToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;*/

    //! RELATION MANY-TO-ONE : Un professeur peut s'inscrire à un sujet de thèse
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;

}
