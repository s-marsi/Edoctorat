package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurCommissionProfesseurs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private ProfesseurProfesseur professeur;

    @ManyToOne
    @JoinColumn(name = "commission_id")
    private ProfesseurCommission commission;
}
