package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurExaminer;
import org.example.edoctorat.Repository.ProfesseurExaminerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurExaminerService {

    private final ProfesseurExaminerRepository examinerRepository;

    public ProfesseurExaminerService(ProfesseurExaminerRepository examinerRepository) {
        this.examinerRepository = examinerRepository;
    }

    public List<ProfesseurExaminer> getAllExaminers() {
        return examinerRepository.findAll();
    }

    public List<ProfesseurExaminer> getExaminersBySujetId(int sujetId) {
        return examinerRepository.findBySujet_Id(sujetId);
    }

    public ProfesseurExaminer createExaminer(ProfesseurExaminer examiner) {
        return examinerRepository.save(examiner);
    }
}
