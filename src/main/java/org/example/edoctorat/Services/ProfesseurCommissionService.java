package org.example.edoctorat.Services;

import org.example.edoctorat.Models.ProfesseurCommission;
import org.example.edoctorat.Repository.ProfesseurCommissionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesseurCommissionService {

    private final ProfesseurCommissionRepository commissionRepository;

    public ProfesseurCommissionService(ProfesseurCommissionRepository commissionRepository) {
        this.commissionRepository = commissionRepository;
    }

    public List<ProfesseurCommission> getAllCommissions() {
        return commissionRepository.findAll();
    }

    public ProfesseurCommission createCommission(ProfesseurCommission commission) {
        return commissionRepository.save(commission);
    }

    public void deleteCommission(int id) {
        commissionRepository.deleteById(id);
    }
}
