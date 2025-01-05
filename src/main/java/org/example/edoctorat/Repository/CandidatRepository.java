package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.CandidatCandidat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CandidatRepository extends JpaRepository<CandidatCandidat, Long> {
    List<CandidatCandidat> findCandidatsByNomCandidatAr(String nomCandidatAr);
}