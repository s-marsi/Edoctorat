package org.example.edoctorat.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;


@Entity
@Data
public class ProfesseurEtablissement {
    @Id
    private String idEtablissement;
    private String nomEtablissement;

    //! RELATION ONE-TO-MANY : Un établissement peut avoir plusieurs professeurs
    @OneToMany(mappedBy = "etablissement", cascade = CascadeType.ALL)
    private Set<ProfesseurProfesseur> professeurs = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un établissement peut avoir plusieurs formations doctorales
    @OneToMany(mappedBy = "etablissement")
    private Set<ProfesseurFormationDoctorale> formationsDoctorales = new HashSet<>();

    //! RELATION ONE-TO-MANY : Un établissement peut avoir plusieurs laboratoires
    @OneToMany(mappedBy = "etablissement")
    private Set<ProfesseurLaboratoire> laboratoires = new HashSet<>();

}
