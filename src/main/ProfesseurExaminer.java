package org.example.app.Models;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class ProfesseurExaminer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String decision;
    private float noteDossier;
    private int noteEntretien;
    private int publier;
    private int commission_id;
    private int sujet_id;
    private int candidat_id;
    private int valider;
}
