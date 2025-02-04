package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurCed;
import org.example.edoctorat.Services.ProfesseurCedService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ceds")
@CrossOrigin(origins = "*")
public class ProfesseurCedController {
    private final ProfesseurCedService cedService;

    public ProfesseurCedController(ProfesseurCedService cedService) {
        this.cedService = cedService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurCed>> getAllCeds() {
        return ResponseEntity.ok(cedService.getAllCeds());
    }

    @PostMapping
    public ResponseEntity<ProfesseurCed> createCed(@RequestBody ProfesseurCed ced) {
        return ResponseEntity.ok(cedService.createCed(ced));
    }
}
