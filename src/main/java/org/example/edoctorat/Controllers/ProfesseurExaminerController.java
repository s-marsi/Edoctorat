package org.example.edoctorat.Controllers;

import org.example.edoctorat.Models.ProfesseurExaminer;
import org.example.edoctorat.Services.ProfesseurExaminerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/examiners")
@CrossOrigin(origins = "*")
public class ProfesseurExaminerController {

    private final ProfesseurExaminerService examinerService;

    public ProfesseurExaminerController(ProfesseurExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping
    public ResponseEntity<List<ProfesseurExaminer>> getAllExaminers() {
        return ResponseEntity.ok(examinerService.getAllExaminers());
    }

    @GetMapping("/sujet/{sujetId}")
    public ResponseEntity<List<ProfesseurExaminer>> getExaminersBySujet(@PathVariable int sujetId) {
        return ResponseEntity.ok(examinerService.getExaminersBySujetId(sujetId));
    }

    @PostMapping
    public ResponseEntity<ProfesseurExaminer> createExaminer(@RequestBody ProfesseurExaminer examiner) {
        return ResponseEntity.ok(examinerService.createExaminer(examiner));
    }
}
