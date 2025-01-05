package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Entity
@Data
public class CandidatCandidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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
    private int pays_id;
    private int user_id;
    private int fonctionaire =0;

    @ManyToOne
    @JoinColumn(name = "pays_id")
    private CandidatPays candidatPays;

    @OneToMany(mappedBy = "candidat_candidat", cascade = CascadeType.ALL, orphanRemoval = true)
    private ArrayList<CandidatDiplome> candidatDiplomes = new ArrayList<>();

    @OneToMany(mappedBy = "candidat_candidat")
    private ArrayList<CandidatNotification> candidatNotifications = new ArrayList<>();

    @OneToMany(mappedBy = "candidat_candidat", cascade = CascadeType.ALL, orphanRemoval = true)
    private  ArrayList<CandidatPostuler> candidatPostulers = new ArrayList<>();

    @OneToOne(mappedBy = "candidat_candidat", cascade = CascadeType.ALL, orphanRemoval = true)
    private ProfesseurInscription professeurInscription;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}