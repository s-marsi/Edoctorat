package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class ProfesseurCed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String pathImage;
    private String initiale;
    private String titre;
    private int directeur_id;


}
