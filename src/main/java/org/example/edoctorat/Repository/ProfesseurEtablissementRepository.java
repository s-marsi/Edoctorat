package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurEtablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurEtablissementRepository extends JpaRepository<ProfesseurEtablissement, String> {
}
