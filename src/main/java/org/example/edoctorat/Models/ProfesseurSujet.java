package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class ProfesseurSujet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;
    private String description;
    // private int coDirecteur_id;
    // private int formationDoctorale_id;
    // private int professeur_id;

    //! RELATION MANY-TO-ONE : Un sujet appartient à un seul professeur
    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private ProfesseurProfesseur professeur;

    //! RELATION ONE-TO-MANY : Un sujet peut recevoir plusieurs candidatures
    @OneToMany(mappedBy = "sujet", cascade = CascadeType.ALL)
    private Set<CandidatPostuler> candidatures = new HashSet<>();

    /*//! RELATION ONE-TO-MANY : Un sujet peut être postulé par plusieurs candidats
    @OneToMany(mappedBy = "sujet")
    private Set<CandidatPostuler> candidats = new HashSet<>();*/

    //! RELATION MANY-TO-ONE : Un sujet appartient à une formation doctorale
    @ManyToOne
    @JoinColumn(name = "formationDoctorale_id")
    private ProfesseurFormationDoctorale formationDoctorale;

    //! RELATION ONE-TO-MANY : Un sujet est examiné par une commission
    @OneToMany(mappedBy = "sujet")
    private Set<ProfesseurExaminer> examiners = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un sujet peut générer plusieurs notifications
    @OneToMany(mappedBy = "sujet")
    private Set<CandidatNotification> notifications = new HashSet<>();

    //! RELATION MANY-TO-ONE : Un sujet a un co-directeur, qui est un professeur
    @ManyToOne
    @JoinColumn(name = "coDirecteur_id")
    private ProfesseurProfesseur coDirecteur;

    //! RELATION ONE-TO-MANY : Un sujet peut avoir plusieurs inscriptions de professeurs
    @OneToMany(mappedBy = "sujet")
    private Set<ProfesseurInscription> inscriptions = new HashSet<>();

}
