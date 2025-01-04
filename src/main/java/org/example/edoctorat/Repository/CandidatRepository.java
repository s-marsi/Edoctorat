package org.example.edoctorat.Repository;

import org.example.edoctorat.Models.CandidatModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CandidatRepository extends JpaRepository<CandidatModel, Long> {
    List<CandidatModel> findCandidatsByNomCandidatAr(String nomCandidatAr);
}