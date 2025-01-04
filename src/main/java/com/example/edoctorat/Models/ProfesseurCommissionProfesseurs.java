package com.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurCommissionProfesseurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int commission_id;
    private int professeur_id;
}
