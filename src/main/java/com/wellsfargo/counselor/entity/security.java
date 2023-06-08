package com.wellsfargo.counselor.entity;


import org.springframework.format.datetime.DateFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class security {

 @ManyToOne
 @JoinColumn(name = "portfolioId")
    private portfolio portfolio;


    @Id
    @GeneratedValue()
    private long securityId;
    //private long portfolioId;

    @Column(nullable = false)
    private String Name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private DateFormatter purchasedate;

    @Column(nullable = false)
    private int quantity;

    protected security() {

    }

    public security(String Name, String category, Long purchasePrice,  DateFormatter purchasedate ,int quantity) {
        this.Name = Name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchasedate = purchasedate;
        this.quantity =quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }
    // public Long getPortfolioId() {
    //     return portfolioId;
    // }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category= category;
    }

    public long getPurchasePrice() {
        return purchasePrice ;
    }

    public void setPurchasePrice(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public DateFormatter getPurchaseDate() {
        return purchasedate;
    }

    public void setPurchaseDate(DateFormatter purchasedate) {
        this.purchasedate = purchasedate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
