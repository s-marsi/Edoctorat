package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class ProfesseurCed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String description;
    private String pathImage;
    private String initiale;
    private String titre;
    // private int directeur_id;

    //! RELATION ONE-TO-MANY : Un CED peut avoir plusieurs formations doctorales
    @OneToMany(mappedBy = "ced")
    private Set<ProfesseurFormationDoctorale> formations = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un CED peut avoir plusieurs laboratoires
    @OneToMany(mappedBy = "ced")
    private Set<ProfesseurLaboratoire> laboratoires = new HashSet<>();

    //! RELATION MANY-TO-ONE : Un CED est dirigé par un ProfesseurProfesseur
    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private ProfesseurProfesseur directeur;


}
