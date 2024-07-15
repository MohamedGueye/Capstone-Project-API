package com.gcu.CapstoneProject.CapstoneProject.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name="customer_info")
public class CustomerInfo {

    @Id
    private String accountNumber;
    private String symbol;
    private String price;
    private String quantity;
    private String marketCap;
    private String rentalUnit;
    private String commercialProperty;
    private String yearlyPropertyTax;
    private String gold;
    private String silver;
    private String oil;
    private String food;
    private String llcBusinesses;
    private String smallBusinesses;
    private String employees;

    public CustomerInfo(String accountNumber, String symbol, String price, String quantity, String marketCap, String rentalUnit, String commercialProperty, String yearlyPropertyTax, String gold, String silver, String oil, String food, String llcBusinesses, String smallBusinesses, String employees) {
        this.accountNumber = accountNumber;
        this.symbol = symbol;
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.rentalUnit = rentalUnit;
        this.commercialProperty = commercialProperty;
        this.yearlyPropertyTax = yearlyPropertyTax;
        this.gold = gold;
        this.silver = silver;
        this.oil = oil;
        this.food = food;
        this.llcBusinesses = llcBusinesses;
        this.smallBusinesses = smallBusinesses;
        this.employees = employees;
    }

    public CustomerInfo() {
        super();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getRentalUnit() {
        return rentalUnit;
    }

    public void setRentalUnit(String rentalUnit) {
        this.rentalUnit = rentalUnit;
    }

    public String getCommercialProperty() {
        return commercialProperty;
    }

    public void setCommercialProperty(String commercialProperty) {
        this.commercialProperty = commercialProperty;
    }

    public String getYearlyPropertyTax() {
        return yearlyPropertyTax;
    }

    public void setYearlyPropertyTax(String yearlyPropertyTax) {
        this.yearlyPropertyTax = yearlyPropertyTax;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }

    public String getSilver() {
        return silver;
    }

    public void setSilver(String silver) {
        this.silver = silver;
    }

    public String getOil() {
        return oil;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLlcBusinesses() {
        return llcBusinesses;
    }

    public void setLlcBusinesses(String llcBusinesses) {
        this.llcBusinesses = llcBusinesses;
    }

    public String getSmallBusinesses() {
        return smallBusinesses;
    }

    public void setSmallBusinesses(String smallBusinesses) {
        this.smallBusinesses = smallBusinesses;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }
}
