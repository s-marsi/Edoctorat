package org.example.edoctorat.Controllers;


import org.example.edoctorat.Models.CandidatCandidat;
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
    public List<CandidatCandidat> getCandidats() {
        return candidatService.getCandidats();
    }

    @GetMapping("/{id}")
    public Optional<CandidatCandidat> getCandidatById(@PathVariable Long id) {
        return candidatService.getCandidatById(id);
    }

    @PostMapping("/")
    public CandidatCandidat addCandidat(@RequestBody CandidatCandidat candidat) { // Add @RequestBody here
        return candidatService.addCandidat(candidat);
    }

    @PutMapping("/{id}")
    public CandidatCandidat updateCandidat(@PathVariable Long id, @RequestBody CandidatCandidat candidat) { // Add @RequestBody here
        return candidatService.updateCandidat(id, candidat);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidat(@PathVariable Long id) {
        candidatService.deleteCandidat(id);
    }

    @GetMapping("/{nom}")
    public List<CandidatCandidat> getCandidatsByNom(@PathVariable String nom) {
        return candidatService.getCandidatsByNom(nom);
}
}
