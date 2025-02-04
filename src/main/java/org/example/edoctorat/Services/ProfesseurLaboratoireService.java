package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurLaboratoire;
import org.example.edoctorat.Repository.ProfesseurLaboratoireRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesseurLaboratoireService {
    private final ProfesseurLaboratoireRepository laboratoireRepository;

    public ProfesseurLaboratoireService(ProfesseurLaboratoireRepository laboratoireRepository) {
        this.laboratoireRepository = laboratoireRepository;
    }

    public List<ProfesseurLaboratoire> getAllLaboratoires() {
        return laboratoireRepository.findAll();
    }

    public Optional<ProfesseurLaboratoire> getLaboratoireById(int id) {
        return laboratoireRepository.findById(id);
    }

    public ProfesseurLaboratoire createLaboratoire(ProfesseurLaboratoire laboratoire) {
        return laboratoireRepository.save(laboratoire);
    }

    public ProfesseurLaboratoire updateLaboratoire(int id, ProfesseurLaboratoire updatedLaboratoire) {
        return laboratoireRepository.findById(id).map(lab -> {
            lab.setNomLaboratoire(updatedLaboratoire.getNomLaboratoire());
            lab.setDescription(updatedLaboratoire.getDescription());
            return laboratoireRepository.save(lab);
        }).orElseThrow(() -> new RuntimeException("Laboratoire not found"));
    }

    public void deleteLaboratoire(int id) {
        laboratoireRepository.deleteById(id);
    }
}

