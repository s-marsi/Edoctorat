package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurCommission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesseurCommissionRepository extends JpaRepository<ProfesseurCommission, Integer> {
}