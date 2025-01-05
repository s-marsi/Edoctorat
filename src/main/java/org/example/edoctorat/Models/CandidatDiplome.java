package org.example.edoctorat.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class CandidatDiplome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String intitule;
    private String type;
    private Date dateCommission;
    private String mention;
    private String pays;
    private String etablissement;
    private String specialite;
    private String ville ;
    private String province;
    private double moyen_generale;
    private int candidat_id;

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;
}
