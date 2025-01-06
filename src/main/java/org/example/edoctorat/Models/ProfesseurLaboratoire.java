package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class ProfesseurLaboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomLaboratoire;
    private String description;
    private String pathImage;
    private String initial;
    // private int ced_id;
    // private int directeur_id;
    // private String etablissement_id;

    //! RELATION ONE-TO-MANY : Un laboratoire peut contenir plusieurs professeurs
    @OneToMany(mappedBy = "laboratoire", cascade = CascadeType.ALL)
    private Set<ProfesseurProfesseur> professeurs = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un laboratoire peut avoir plusieurs commissions
    @OneToMany(mappedBy = "laboratoire")
    private Set<ProfesseurCommission> commissions = new HashSet<>();

    //! RELATION MANY-TO-ONE : Un laboratoire appartient à un CED
    @ManyToOne
    @JoinColumn(name = "ced_id")
    private ProfesseurCed ced;

    //! RELATION MANY-TO-ONE : Un laboratoire appartient à un établissement
    @ManyToOne
    @JoinColumn(name = "etablissement_id")
    private ProfesseurEtablissement etablissement;

    //! RELATION MANY-TO-ONE : Un laboratoire est dirigé par un professeur
    @ManyToOne
    @JoinColumn(name = "directeur_id")
    private ProfesseurProfesseur directeur;
}
