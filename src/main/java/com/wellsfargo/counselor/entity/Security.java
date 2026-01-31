package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchase_date;

    @Column(nullable = false)
    private double purchase_price;

    @Column(nullable = false)
    private double purchase_quantity;

    public Security(Portfolio portfolio, String name, String category, Date purchase_date, double purchase_price, double purchase_quantity) {
        this.portfolio = portfolio;
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.purchase_quantity = purchase_quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public double getPurchase_quantity() {
        return purchase_quantity;
    }

    public void setPurchase_quantity(double purchase_quantity) {
        this.purchase_quantity = purchase_quantity;
    }
}
