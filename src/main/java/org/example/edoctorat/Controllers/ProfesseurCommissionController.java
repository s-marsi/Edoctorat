package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurCommission;
import org.example.edoctorat.Services.ProfesseurCommissionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commissions")
@CrossOrigin(origins = "*")
public class ProfesseurCommissionController {

    private final ProfesseurCommissionService commissionService;

    public ProfesseurCommissionController(ProfesseurCommissionService commissionService) {
        this.commissionService = commissionService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurCommission>> getAllCommissions() {
        return ResponseEntity.ok(commissionService.getAllCommissions());
    }

    @PostMapping
    public ResponseEntity<ProfesseurCommission> createCommission(@RequestBody ProfesseurCommission commission) {
        return ResponseEntity.ok(commissionService.createCommission(commission));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCommission(@PathVariable int id) {
        commissionService.deleteCommission(id);
        return ResponseEntity.noContent().build();
    }
}
