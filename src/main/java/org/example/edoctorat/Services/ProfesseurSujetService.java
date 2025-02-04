package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurSujet;
import org.example.edoctorat.Repository.ProfesseurSujetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurSujetService {

    private final ProfesseurSujetRepository sujetRepository;

    public ProfesseurSujetService(ProfesseurSujetRepository sujetRepository) {
        this.sujetRepository = sujetRepository;
    }

    public List<ProfesseurSujet> getAllSujets() {
        return sujetRepository.findAll();
    }

    public List<ProfesseurSujet> getSujetsByProfesseurId(int professeurId) {
        return sujetRepository.findByProfesseur_Id(professeurId);
    }

    public ProfesseurSujet createSujet(ProfesseurSujet sujet) {
        return sujetRepository.save(sujet);
    }

    public void deleteSujet(int id) {
        sujetRepository.deleteById(id);
    }
}
