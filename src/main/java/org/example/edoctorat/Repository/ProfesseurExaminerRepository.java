package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.ProfesseurExaminer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProfesseurExaminerRepository extends JpaRepository<ProfesseurExaminer, Integer> {

    // Get all exams related to a subject
    List<ProfesseurExaminer> findBySujet_Id(int sujetId);
}