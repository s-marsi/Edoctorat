package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class CandidatNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    // private int candidat_id;
    // private int commission_id;
    // private int sujet_id;

    //! RELATION MANY-TO-ONE : Une notification appartient à un seul candidat
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;

    //! RELATION MANY-TO-ONE : Une notification est liée à un sujet
    @ManyToOne
    @JoinColumn(name = "sujet_id")
    private ProfesseurSujet sujet;

    //! RELATION MANY-TO-ONE : Une notification est envoyée par une commission
    @ManyToOne
    @JoinColumn(name = "commission_id")
    private ProfesseurCommission commission;


}
