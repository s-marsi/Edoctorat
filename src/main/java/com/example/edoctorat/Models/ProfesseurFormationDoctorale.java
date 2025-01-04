package com.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurFormationDoctorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pathImage;
    private String initiale;
    private String titre;
    private String axeDeRecherche;
    private Date dateAccreditation;
    private int ced_id;
    private String etablissement_id;
}
