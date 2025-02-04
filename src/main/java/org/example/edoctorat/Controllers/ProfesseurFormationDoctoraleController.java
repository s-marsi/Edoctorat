package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurFormationDoctorale;
import org.example.edoctorat.Services.ProfesseurFormationDoctoraleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/formations")
@CrossOrigin(origins = "*")
public class ProfesseurFormationDoctoraleController {
    private final ProfesseurFormationDoctoraleService formationService;

    public ProfesseurFormationDoctoraleController(ProfesseurFormationDoctoraleService formationService) {
        this.formationService = formationService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurFormationDoctorale>> getAllFormations() {
        return ResponseEntity.ok(formationService.getAllFormations());
    }

    @PostMapping
    public ResponseEntity<ProfesseurFormationDoctorale> createFormation(@RequestBody ProfesseurFormationDoctorale formation) {
        return ResponseEntity.ok(formationService.createFormation(formation));
    }
}
