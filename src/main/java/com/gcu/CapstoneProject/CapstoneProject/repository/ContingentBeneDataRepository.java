package com.gcu.CapstoneProject.CapstoneProject.repository;

import com.gcu.CapstoneProject.CapstoneProject.models.ContingentBeneficiary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContingentBeneDataRepository extends JpaRepository<ContingentBeneficiary, String> {
}