package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class ProfesseurCommission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date dateCommission;
    private String lieu;
    private Date heure;
    private int labo_id;
}
