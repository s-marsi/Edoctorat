package org.example.edoctorat.Controllers;


import org.example.edoctorat.Models.CandidatModel;
import org.example.edoctorat.Services.CandidatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidats")
public class CandidatController {
    @Autowired
    public CandidatService candidatService;

    @GetMapping("/")
    public List<CandidatModel> getCandidats() {
        return candidatService.getCandidats();
    }

    @GetMapping("/{id}")
    public Optional<CandidatModel> getCandidatById(@PathVariable Long id) {
        return candidatService.getCandidatById(id);
    }

    @PostMapping("/")
    public CandidatModel addCandidat(@RequestBody CandidatModel candidat) { // Add @RequestBody here
        return candidatService.addCandidat(candidat);
    }

    @PutMapping("/{id}")
    public CandidatModel updateCandidat(@PathVariable Long id, @RequestBody CandidatModel candidat) { // Add @RequestBody here
        return candidatService.updateCandidat(id, candidat);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable Long id) {
        candidatService.deleteCandidat(id);
    }

    @GetMapping("/{nom}")
    public List<CandidatModel> getCandidatsByNom(@PathVariable String nom) {
        return candidatService.getCandidatsByNom(nom);
}
}
