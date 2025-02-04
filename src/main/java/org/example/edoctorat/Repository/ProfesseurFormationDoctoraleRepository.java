package org.example.edoctorat.Repository;


import org.example.edoctorat.Models.ProfesseurFormationDoctorale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurFormationDoctoraleRepository extends JpaRepository<ProfesseurFormationDoctorale, Integer> {
}