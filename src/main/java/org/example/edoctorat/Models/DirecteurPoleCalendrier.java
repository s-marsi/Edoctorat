package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;


@Entity
@Data
public class DirecteurPoleCalendrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String action;
    private Date dateDebut;
    private Date dateFin;
    private String pour;
}
