package com.gcu.CapstoneProject.CapstoneProject.controller;

import com.gcu.CapstoneProject.CapstoneProject.ErrorHandler.InternalServerError;
import com.gcu.CapstoneProject.CapstoneProject.models.ContingentBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.models.CustomerInfo;
import com.gcu.CapstoneProject.CapstoneProject.models.PrimaryBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.service.DataInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    @Qualifier("method")
    DataInterface serviceImpl;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/customer/{accountNumber}")
    public ResponseEntity<CustomerInfo> getCustomer(@PathVariable String accountNumber) {
        try {
            CustomerInfo customerInfo = serviceImpl.getCustomer(accountNumber);
            return new ResponseEntity<CustomerInfo>(customerInfo, HttpStatus.OK);
        } catch (Exception e) {
            throw new IllegalStateException("Cannot find customer");
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("primaryBeneficiary/{accountNumber}")
    public ResponseEntity<PrimaryBeneficiary> getPrimaryBeneficiary(@PathVariable String accountNumber) {
        PrimaryBeneficiary primaryBeneficiary = serviceImpl.getPrimaryBeneficiary(accountNumber);
        return new ResponseEntity<PrimaryBeneficiary>(primaryBeneficiary, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("contingentBeneficiary/{accountNumber}")
    public ResponseEntity<ContingentBeneficiary> getContingentBeneficiary(@PathVariable String accountNumber) {
        ContingentBeneficiary contingentBeneficiary = serviceImpl.getContingentBeneficiary(accountNumber);
        return new ResponseEntity<ContingentBeneficiary>(contingentBeneficiary, HttpStatus.OK);
    }
}
