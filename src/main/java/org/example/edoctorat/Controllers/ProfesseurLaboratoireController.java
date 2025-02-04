package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurLaboratoire;
import org.example.edoctorat.Services.ProfesseurLaboratoireService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/laboratoires")
@CrossOrigin(origins = "*")
public class ProfesseurLaboratoireController {
    private final ProfesseurLaboratoireService laboratoireService;

    public ProfesseurLaboratoireController(ProfesseurLaboratoireService laboratoireService) {
        this.laboratoireService = laboratoireService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurLaboratoire>> getAllLaboratoires() {
        return ResponseEntity.ok(laboratoireService.getAllLaboratoires());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProfesseurLaboratoire> getLaboratoireById(@PathVariable int id) {
        Optional<ProfesseurLaboratoire> laboratoire = laboratoireService.getLaboratoireById(id);
        return laboratoire.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ProfesseurLaboratoire> createLaboratoire(@RequestBody ProfesseurLaboratoire laboratoire) {
        return ResponseEntity.ok(laboratoireService.createLaboratoire(laboratoire));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProfesseurLaboratoire> updateLaboratoire(@PathVariable int id, @RequestBody ProfesseurLaboratoire updatedLaboratoire) {
        return ResponseEntity.ok(laboratoireService.updateLaboratoire(id, updatedLaboratoire));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLaboratoire(@PathVariable int id) {
        laboratoireService.deleteLaboratoire(id);
        return ResponseEntity.noContent().build();
    }
}
