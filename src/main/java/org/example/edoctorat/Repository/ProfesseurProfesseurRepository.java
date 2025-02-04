package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurProfesseur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProfesseurProfesseurRepository extends JpaRepository<ProfesseurProfesseur, Integer> {

    // Custom query method to find a professor by CIN
    Optional<ProfesseurProfesseur> findByCin(String cin);
}