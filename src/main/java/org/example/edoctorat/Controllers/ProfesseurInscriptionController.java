package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurInscription;
import org.example.edoctorat.Services.ProfesseurInscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inscriptions")
@CrossOrigin(origins = "*")
public class ProfesseurInscriptionController {
    private final ProfesseurInscriptionService inscriptionService;

    public ProfesseurInscriptionController(ProfesseurInscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurInscription>> getAllInscriptions() {
        return ResponseEntity.ok(inscriptionService.getAllInscriptions());
    }

    @PostMapping
    public ResponseEntity<ProfesseurInscription> createInscription(@RequestBody ProfesseurInscription inscription) {
        return ResponseEntity.ok(inscriptionService.createInscription(inscription));
    }
}
