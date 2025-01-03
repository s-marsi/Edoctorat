package org.example.edoctorat.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CandidatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String cne;
    private String cin;
    private String nomCandidat;
    private String prenomCandidat;
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
    private String situationFamiliale;
    private int pays_id;
    private int user_id;
    private int fonctionaire =0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}