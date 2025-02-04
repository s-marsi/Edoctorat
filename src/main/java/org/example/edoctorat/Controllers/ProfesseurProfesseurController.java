package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurProfesseur;
import org.example.edoctorat.Services.ProfesseurProfesseurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/professeurs")
@CrossOrigin(origins = "*") // Allow front-end access
public class ProfesseurProfesseurController {

    private final ProfesseurProfesseurService professeurService;

    public ProfesseurProfesseurController(ProfesseurProfesseurService professeurService) {
        this.professeurService = professeurService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurProfesseur>> getAllProfesseurs() {
        return ResponseEntity.ok(professeurService.getAllProfesseurs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesseurProfesseur> getProfesseurById(@PathVariable int id) {
        Optional<ProfesseurProfesseur> professeur = professeurService.getProfesseurById(id);
        return professeur.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProfesseurProfesseur> createProfesseur(@RequestBody ProfesseurProfesseur professeur) {
        return ResponseEntity.ok(professeurService.createProfesseur(professeur));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfesseurProfesseur> updateProfesseur(@PathVariable int id, @RequestBody ProfesseurProfesseur professeur) {
        return ResponseEntity.ok(professeurService.updateProfesseur(id, professeur));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfesseur(@PathVariable int id) {
        professeurService.deleteProfesseur(id);
        return ResponseEntity.noContent().build();
    }
}
