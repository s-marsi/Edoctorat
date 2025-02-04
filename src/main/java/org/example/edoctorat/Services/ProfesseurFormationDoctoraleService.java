package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurFormationDoctorale;
import org.example.edoctorat.Repository.ProfesseurFormationDoctoraleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurFormationDoctoraleService {

    private final ProfesseurFormationDoctoraleRepository formationDoctoraleRepository;

    public ProfesseurFormationDoctoraleService(ProfesseurFormationDoctoraleRepository formationDoctoraleRepository) {
        this.formationDoctoraleRepository = formationDoctoraleRepository;
    }

    public List<ProfesseurFormationDoctorale> getAllFormations() {
        return formationDoctoraleRepository.findAll();
    }

    public ProfesseurFormationDoctorale createFormation(ProfesseurFormationDoctorale formation) {
        return formationDoctoraleRepository.save(formation);
    }
}
