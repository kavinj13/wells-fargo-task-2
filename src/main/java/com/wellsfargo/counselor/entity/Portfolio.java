package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private String name;

    public Portfolio(Client client, String name) {
        this.client = client;
        this.name = name;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPortfolioName() {
        return name;
    }

    public void setPortfolioName(String name) {
        this.name = name;
    }
}
