package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class ProfesseurFormationDoctorale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String pathImage;
    private String initiale;
    private String titre;
    private String axeDeRecherche;
    private Date dateAccreditation;
    // private int ced_id;
    // private String etablissement_id;

    //! RELATION MANY-TO-ONE : Une formation appartient à un CED
    @ManyToOne
    @JoinColumn(name = "ced_id")
    private ProfesseurCed ced;

    //! RELATION ONE-TO-MANY : Une formation peut contenir plusieurs sujets
    @OneToMany(mappedBy = "formationDoctorale")
    private Set<ProfesseurSujet> sujets = new HashSet<>();

    //! RELATION MANY-TO-ONE : Une formation doctorale appartient à un établissement
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private ProfesseurEtablissement etablissement;
}
