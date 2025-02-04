package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurProfesseur;
import org.example.edoctorat.Repository.ProfesseurProfesseurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurProfesseurService {

    private final ProfesseurProfesseurRepository professeurRepository;

    public ProfesseurProfesseurService(ProfesseurProfesseurRepository professeurRepository) {
        this.professeurRepository = professeurRepository;
    }

    public List<ProfesseurProfesseur> getAllProfesseurs() {
        return professeurRepository.findAll();
    }

    public Optional<ProfesseurProfesseur> getProfesseurById(int id) {
        return professeurRepository.findById(id);
    }

    public ProfesseurProfesseur createProfesseur(ProfesseurProfesseur professeur) {
        return professeurRepository.save(professeur);
    }

    public ProfesseurProfesseur updateProfesseur(int id, ProfesseurProfesseur updatedProfesseur) {
        return professeurRepository.findById(id).map(professeur -> {
            professeur.setCin(updatedProfesseur.getCin());
            professeur.setTelProfesseur(updatedProfesseur.getTelProfesseur());
            return professeurRepository.save(professeur);
        }).orElseThrow(() -> new RuntimeException("Professeur not found"));
    }

    public void deleteProfesseur(int id) {
        professeurRepository.deleteById(id);
    }
}
