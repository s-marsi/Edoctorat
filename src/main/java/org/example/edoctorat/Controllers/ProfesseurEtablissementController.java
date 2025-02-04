package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurEtablissement;
import org.example.edoctorat.Services.ProfesseurEtablissementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etablissements")
@CrossOrigin(origins = "*")
public class ProfesseurEtablissementController {
    private final ProfesseurEtablissementService etablissementService;

    public ProfesseurEtablissementController(ProfesseurEtablissementService etablissementService) {
        this.etablissementService = etablissementService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurEtablissement>> getAllEtablissements() {
        return ResponseEntity.ok(etablissementService.getAllEtablissements());
    }

    @PostMapping
    public ResponseEntity<ProfesseurEtablissement> createEtablissement(@RequestBody ProfesseurEtablissement etablissement) {
        return ResponseEntity.ok(etablissementService.createEtablissement(etablissement));
    }
}
