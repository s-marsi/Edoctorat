package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
@NoArgsConstructor

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
    // private String etablissement_id;
    // private int labo_id;
    // private int user_id;


    //! RELATION ONE-TO-ONE : Un professeur a un seul compte utilisateur
    @OneToOne
    @JoinColumn(name = "user_id")
    private AuthUser user;

    //! RELATION MANY-TO-ONE : Un professeur appartient à un établissement
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private ProfesseurEtablissement etablissement;

    //! (test) RELATION MANY-TO-MANY : Un professeur peut appartenir à plusieurs commissions
    @OneToMany(mappedBy = "professeur")
    private Set<ProfesseurCommissionProfesseurs> commissions = new HashSet<>();

    //! RELATION MANY-TO-ONE : Un professeur appartient à un laboratoire
    @ManyToOne
    @JoinColumn(name = "labo_id")
    private ProfesseurLaboratoire laboratoire;

    //! RELATION ONE-TO-MANY : Un ProfesseurProfesseur peut diriger plusieurs CED
    @OneToMany(mappedBy = "directeur")
    private Set<ProfesseurCed> ceds = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un professeur peut diriger plusieurs laboratoires
    @OneToMany(mappedBy = "directeur")
    private Set<ProfesseurLaboratoire> laboratoires = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un professeur peut proposer plusieurs sujets
    @OneToMany(mappedBy = "professeur", cascade = CascadeType.ALL)
    private Set<ProfesseurSujet> sujetsProfesseur = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un professeur peut être le co-directeur de plusieurs sujets
    @OneToMany(mappedBy = "coDirecteur")
    private Set<ProfesseurSujet> sujetsCoDirecteur = new HashSet<>();


}
