package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurInscription;
import org.example.edoctorat.Repository.ProfesseurInscriptionRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProfesseurInscriptionService {
    private final ProfesseurInscriptionRepository inscriptionRepository;

    public ProfesseurInscriptionService(ProfesseurInscriptionRepository inscriptionRepository) {
        this.inscriptionRepository = inscriptionRepository;
    }

    public List<ProfesseurInscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }

    public ProfesseurInscription createInscription(ProfesseurInscription inscription) {
        return inscriptionRepository.save(inscription);
    }
}
