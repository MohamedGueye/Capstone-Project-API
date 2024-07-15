package com.gcu.CapstoneProject.CapstoneProject.service;

import com.gcu.CapstoneProject.CapstoneProject.models.ContingentBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.models.CustomerInfo;
import com.gcu.CapstoneProject.CapstoneProject.models.PrimaryBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.repository.ContingentBeneDataRepository;
import com.gcu.CapstoneProject.CapstoneProject.repository.CustomerDataRepository;
import com.gcu.CapstoneProject.CapstoneProject.repository.PrimaryBeneDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("method")
public class DatabaseService implements DataInterface {
    @Autowired
    CustomerDataRepository customerRepository;

    @Autowired
    PrimaryBeneDataRepository primaryBeneRepository;

    @Autowired
    ContingentBeneDataRepository contingentBeneRepository;

    @Override
    public CustomerInfo getCustomer(String accountNumber) {
        return customerRepository.findById(accountNumber).get();
    }

    @Override
    public PrimaryBeneficiary getPrimaryBeneficiary(String accountNumber) {
        return primaryBeneRepository.findById(accountNumber).get();
    }

    @Override
    public ContingentBeneficiary getContingentBeneficiary(String accountNumber) {
        return contingentBeneRepository.findById(accountNumber).get();
    }
}
