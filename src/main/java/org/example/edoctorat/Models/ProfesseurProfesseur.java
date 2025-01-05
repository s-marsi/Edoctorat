package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
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
    private String etablissement_id;
    private int labo_id;
    private int user_id;
}
