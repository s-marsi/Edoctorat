package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class ProfesseurCommission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateCommission;
    private String lieu;
    private Date heure;
    // private int labo_id;

    //! RELATION MANY-TO-MANY : Une commission peut contenir plusieurs professeurs
    @OneToMany(mappedBy = "commission")
    private Set<ProfesseurCommissionProfesseurs> professeurs = new HashSet<>();

    //! RELATION ONE-TO-MANY : Une commission peut contenir plusieurs examinateurs
    @OneToMany(mappedBy = "commission")
    private Set<ProfesseurExaminer> examiners = new HashSet<>();

    //! RELATION MANY-TO-ONE : Une commission est liée à un laboratoire
    @ManyToOne
    @JoinColumn(name = "laboratoire_id") 
    private ProfesseurLaboratoire laboratoire;

    //! RELATION ONE-TO-MANY : Une commission peut envoyer plusieurs notifications
    @OneToMany(mappedBy = "commission")
    private Set<CandidatNotification> notifications = new HashSet<>();
}
