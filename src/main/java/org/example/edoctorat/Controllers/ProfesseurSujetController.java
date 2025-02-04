package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurSujet;
import org.example.edoctorat.Services.ProfesseurSujetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sujets")
@CrossOrigin(origins = "*")
public class ProfesseurSujetController {

    private final ProfesseurSujetService sujetService;

    public ProfesseurSujetController(ProfesseurSujetService sujetService) {
        this.sujetService = sujetService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurSujet>> getAllSujets() {
        return ResponseEntity.ok(sujetService.getAllSujets());
    }

    @GetMapping("/professeur/{professeurId}")
    public ResponseEntity<List<ProfesseurSujet>> getSujetsByProfesseur(@PathVariable int professeurId) {
        return ResponseEntity.ok(sujetService.getSujetsByProfesseurId(professeurId));
    }

    @PostMapping
    public ResponseEntity<ProfesseurSujet> createSujet(@RequestBody ProfesseurSujet sujet) {
        return ResponseEntity.ok(sujetService.createSujet(sujet));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSujet(@PathVariable int id) {
        sujetService.deleteSujet(id);
        return ResponseEntity.noContent().build();
    }
}
