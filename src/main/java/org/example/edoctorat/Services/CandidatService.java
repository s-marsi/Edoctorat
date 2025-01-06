package org.example.edoctorat.Services;

import org.example.edoctorat.Models.CandidatCandidat;
import org.example.edoctorat.Repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    public List<CandidatCandidat> getCandidats() {
        return candidatRepository.findAll();
    }


    public Optional<CandidatCandidat> getCandidatById(Long id){
        return candidatRepository.findById(id);
    }

    public CandidatCandidat addCandidat(CandidatCandidat candidat) {
        return candidatRepository.save(candidat);
    }

    /*public CandidatCandidat updateCandidat(Long id, CandidatCandidat candidat) {
        candidat.setId(id);
        return candidatRepository.save(candidat);
    }*/

    public void deleteCandidat(Long id) {
        candidatRepository.deleteById(id);
    }

    public List<CandidatCandidat> getCandidatsByNom(String nomCandidatAr) {
        return candidatRepository.findCandidatsByNomCandidatAr(nomCandidatAr);
}

}
