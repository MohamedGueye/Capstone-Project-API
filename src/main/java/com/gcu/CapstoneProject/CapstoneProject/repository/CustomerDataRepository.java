package com.gcu.CapstoneProject.CapstoneProject.repository;

import com.gcu.CapstoneProject.CapstoneProject.models.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerInfo, String> {
}
