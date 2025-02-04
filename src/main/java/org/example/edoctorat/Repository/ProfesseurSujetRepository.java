package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurSujet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfesseurSujetRepository extends JpaRepository<ProfesseurSujet, Integer> {

    // Get all subjects proposed by a specific professor
    List<ProfesseurSujet> findByProfesseur_Id(int professeurId);
}