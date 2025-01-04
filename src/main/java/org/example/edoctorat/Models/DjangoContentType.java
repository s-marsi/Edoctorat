package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class DjangoContentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String app_label;
    private String model;
}
