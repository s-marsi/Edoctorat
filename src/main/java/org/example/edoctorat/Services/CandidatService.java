package org.example.edoctorat.Services;

import org.example.edoctorat.Models.CandidatModel;
import org.example.edoctorat.Repository.CandidatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatService {
    @Autowired
    private CandidatRepository candidatRepository;

    public List<CandidatModel> getCandidats() {
        return candidatRepository.findAll();
    }


    public Optional<CandidatModel> getCandidatById(Long id){
        return candidatRepository.findById(id);
    }

    public CandidatModel addCandidat(CandidatModel candidat) {
        return candidatRepository.save(candidat);
    }

    public CandidatModel updateCandidat(Long id, CandidatModel candidat) {
        candidat.setId(id);
        return candidatRepository.save(candidat);
    }

    public void deleteCandidat(Long id) {
        candidatRepository.deleteById(id);
    }

    public List<CandidatModel> getCandidatsByNom(String nomCandidatAr) {
        return candidatRepository.findCandidatsByNomCandidatAr(nomCandidatAr);
}

}
