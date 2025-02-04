package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurCed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurCedRepository extends JpaRepository<ProfesseurCed, Integer> {
}
