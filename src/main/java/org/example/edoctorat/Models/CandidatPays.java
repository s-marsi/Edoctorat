package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class CandidatPays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;


}
