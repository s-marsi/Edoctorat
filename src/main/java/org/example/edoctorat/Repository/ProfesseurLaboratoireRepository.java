package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurLaboratoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurLaboratoireRepository extends JpaRepository<ProfesseurLaboratoire, Integer> {
}
