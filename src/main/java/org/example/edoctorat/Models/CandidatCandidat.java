package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class CandidatCandidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String cne;
    private String cin;
    private String nomCandidatAr;
    private String prenomCandidatAr;
    private String adresse;
    private String adresseAr;
    private String sexe;
    private String villeDeNaissance;
    private String villeDeNaissanceAr;
    private String ville;
    private Date dateDeNaissance;
    private String typeDeHandicape;
    private String academie;
    private String telCandidat;
    private String pathCv;
    private String pathPhoto;
    private int etatDossier;
    private String situation_familiale;
    // private int pays_id;
    // private int user_id;
    private int fonctionaire =0;

    //! RELATION MANY-TO-ONE : Plusieurs candidatures peuvent appartenir à un même utilisateur
    @ManyToOne
    @JoinColumn(name = "user_id")
    private AuthUser user;

    //! RELATION MANY-TO-ONE : Plusieurs candidats peuvent être associés à un seul pays
    @ManyToOne
    @JoinColumn(name = "pays_id")
    private CandidatPays pays;

    //! RELATION ONE-TO-MANY : Un candidat peut avoir plusieurs diplômes
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<CandidatDiplome> diplomes = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un candidat peut recevoir plusieurs notifications
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<CandidatNotification> notifications = new HashSet<>();

    /*//! RELATION ONE-TO-MANY : Un candidat peut postuler à plusieurs sujets
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<CandidatPostuler> candidatures = new HashSet<>();*/
    //! RELATION ONE-TO-MANY : Un candidat peut postuler à plusieurs sujets
    @OneToMany(mappedBy = "candidat", cascade = CascadeType.ALL)
    private Set<CandidatPostuler> candidatures = new HashSet<>();

    //! RELATION ONE-TO-ONE : Une inscription est unique par candidat
    @OneToOne(mappedBy = "candidat", cascade = CascadeType.ALL)
    private ProfesseurInscription inscription;

    //! (Not sure) RELATION ONE-TO-MANY : Un candidat peut être examiné par plusieurs professeurs
    @OneToMany(mappedBy = "candidat")
    private Set<ProfesseurExaminer> examinateurs = new HashSet<>();


}