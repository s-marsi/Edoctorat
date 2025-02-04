package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurCed;
import org.example.edoctorat.Repository.ProfesseurCedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurCedService {
    private final ProfesseurCedRepository cedRepository;

    public ProfesseurCedService(ProfesseurCedRepository cedRepository) {
        this.cedRepository = cedRepository;
    }

    public List<ProfesseurCed> getAllCeds() {
        return cedRepository.findAll();
    }

    public ProfesseurCed createCed(ProfesseurCed ced) {
        return cedRepository.save(ced);
    }
}
