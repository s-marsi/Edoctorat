package org.example.edoctorat.Models;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class CandidatAnnexe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String typeAnnexe;
    private String titre;
    private String pathFile;
    // private int diplome_id;

    //! RELATION MANY-TO-ONE : Une annexe est associée à un diplôme
    @ManyToOne
    @JoinColumn(name = "diplome_id")
    private CandidatDiplome diplome;
}
