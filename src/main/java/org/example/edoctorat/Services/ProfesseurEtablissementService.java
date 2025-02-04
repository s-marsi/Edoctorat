package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurEtablissement;
import org.example.edoctorat.Repository.ProfesseurEtablissementRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurEtablissementService {
    private final ProfesseurEtablissementRepository etablissementRepository;

    public ProfesseurEtablissementService(ProfesseurEtablissementRepository etablissementRepository) {
        this.etablissementRepository = etablissementRepository;
    }

    public List<ProfesseurEtablissement> getAllEtablissements() {
        return etablissementRepository.findAll();
    }

    public ProfesseurEtablissement createEtablissement(ProfesseurEtablissement etablissement) {
        return etablissementRepository.save(etablissement);
    }
}
