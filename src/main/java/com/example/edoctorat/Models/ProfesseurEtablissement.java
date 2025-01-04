package com.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class ProfesseurEtablissement {
    @Id
    private String idEtablissement;
    private String nomEtablissement;

}
