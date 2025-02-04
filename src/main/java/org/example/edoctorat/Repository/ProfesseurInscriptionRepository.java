package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurInscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurInscriptionRepository extends JpaRepository<ProfesseurInscription, Integer> {
}
