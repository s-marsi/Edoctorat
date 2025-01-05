package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class CandidatPostuler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pathFile;
    private int candidat_id;
    private int sujet_id;

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat candidat;
}
