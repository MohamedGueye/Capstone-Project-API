package com.gcu.CapstoneProject.CapstoneProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="primary_beneficiary")
public class PrimaryBeneficiary {

    @Id
    private String accountNumber;
    private String ssn;
    private String dob;
    private String paid;
    private String legalHeir;
    private String sharePercentage;
    private String beneStatus;
    private String relationship;

    public PrimaryBeneficiary(String accountNumber, String ssn, String dob, String paid, String legalHeir, String sharePercentage, String beneStatus, String relationship) {
        this.accountNumber = accountNumber;
        this.ssn = ssn;
        this.dob = dob;
        this.paid = paid;
        this.legalHeir = legalHeir;
        this.sharePercentage = sharePercentage;
        this.beneStatus = beneStatus;
        this.relationship = relationship;
    }

    public PrimaryBeneficiary() {
        super();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid;
    }

    public String getLegalHeir() {
        return legalHeir;
    }

    public void setLegalHeir(String legalHeir) {
        this.legalHeir = legalHeir;
    }

    public String getSharePercentage() {
        return sharePercentage;
    }

    public void setSharePercentage(String sharePercentage) {
        this.sharePercentage = sharePercentage;
    }

    public String getBeneStatus() {
        return beneStatus;
    }

    public void setBeneStatus(String beneStatus) {
        this.beneStatus = beneStatus;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}

