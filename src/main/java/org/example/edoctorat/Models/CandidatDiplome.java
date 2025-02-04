package org.example.edoctorat.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
    // private int candidat_id;

    //! RELATION MANY-TO-ONE : Un diplôme appartient à un seul candidat
    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;

    //! RELATION ONE-TO-MANY : Un diplôme peut avoir plusieurs annexes de candidats
    @OneToMany(mappedBy = "diplome")
    private Set<CandidatAnnexe> annexes = new HashSet<>();

}
