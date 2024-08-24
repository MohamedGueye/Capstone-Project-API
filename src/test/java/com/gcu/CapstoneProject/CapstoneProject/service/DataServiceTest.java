package com.gcu.CapstoneProject.CapstoneProject.service;

import com.gcu.CapstoneProject.CapstoneProject.models.ContingentBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.models.CustomerInfo;
import com.gcu.CapstoneProject.CapstoneProject.models.PrimaryBeneficiary;
import com.gcu.CapstoneProject.CapstoneProject.repository.ContingentBeneDataRepository;
import com.gcu.CapstoneProject.CapstoneProject.repository.CustomerDataRepository;
import com.gcu.CapstoneProject.CapstoneProject.repository.PrimaryBeneDataRepository;
import net.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DataServiceTest {

    @InjectMocks
    DatabaseService apiData;

    @Mock
    PrimaryBeneDataRepository primaryBene;
    ContingentBeneDataRepository contingentBene;
    CustomerDataRepository customer;

    private CustomerInfo customerInfo;
    private ContingentBeneficiary contingentBeneficiary;
    private PrimaryBeneficiary primaryBeneficiary;
    private static RandomString randomString;

    @BeforeAll
    public static void setUp() {
        randomString = new RandomString(10);
    }

    @Test
    @DisplayName("Test Get All Customers")
    public void getCustomers() {
        var accountNumber = UUID.fromString(customerInfo.getAccountNumber());
        Mockito.when(customer.findById(String.valueOf(accountNumber))).thenReturn(Optional.ofNullable(customerInfo));

        CustomerInfo user = new DatabaseService().getCustomer(String.valueOf(accountNumber));
        assertEquals(user.getEmployees(), customerInfo.getEmployees(), "0");
    }

    @Test
    @DisplayName("Test Get All Primary Beneficiary")
    public void getPrimaryBeneficiaries() {
        var accountNumber = UUID.fromString(primaryBeneficiary.getAccountNumber());
        Mockito.when(primaryBene.findById(String.valueOf(accountNumber))).thenReturn(Optional.ofNullable(primaryBeneficiary));

        PrimaryBeneficiary user = new DatabaseService().getPrimaryBeneficiary(String.valueOf(accountNumber));
        assertEquals(user.getBeneStatus(), primaryBeneficiary.getBeneStatus(), "Approved");
    }

    @Test
    @DisplayName("Test Get All Primary Beneficiary")
    public void getContingentBeneficiaries() {
        var accountNumber = UUID.fromString(contingentBeneficiary.getAccountNumber());
        Mockito.when(contingentBene.findById(String.valueOf(accountNumber))).thenReturn(Optional.ofNullable(contingentBeneficiary));

        ContingentBeneficiary user = new DatabaseService().getContingentBeneficiary(String.valueOf(accountNumber));
        assertEquals(user.getLegalHeir(), primaryBeneficiary.getLegalHeir(), "Per Capita");
    }
}
