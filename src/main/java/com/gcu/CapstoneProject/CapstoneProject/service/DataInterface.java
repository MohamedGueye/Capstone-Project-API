package com.gcu.CapstoneProject.CapstoneProject.service;

import com.gcu.CapstoneProject.CapstoneProject.models.ContingentBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.models.CustomerInfo;
import com.gcu.CapstoneProject.CapstoneProject.models.PrimaryBeneficiary;

public interface DataInterface {
    CustomerInfo getCustomer(String accountNumber);
    PrimaryBeneficiary getPrimaryBeneficiary(String accountNumber);
    ContingentBeneficiary getContingentBeneficiary(String accountNumber);
}
