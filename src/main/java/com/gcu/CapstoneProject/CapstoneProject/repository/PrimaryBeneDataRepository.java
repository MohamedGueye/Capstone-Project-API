package com.gcu.CapstoneProject.CapstoneProject.repository;

import com.gcu.CapstoneProject.CapstoneProject.models.PrimaryBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryBeneDataRepository extends JpaRepository<PrimaryBeneficiary, String> {
}
