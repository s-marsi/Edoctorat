package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class CandidatNotification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private int candidat_id;
    private int commission_id;
    private int sujet_id;

    @ManyToOne
    @JoinColumn(name = "candidat_id")
    private CandidatCandidat Candidat;


}
