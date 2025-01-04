package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurInscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateDiposeDossier;
    private String remarque;
    private int valider;
    private int candidat_id;
    private int sujet_id;
}
