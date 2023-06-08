package com.wellsfargo.counselor.entity;

import java.util.List;

import org.springframework.format.datetime.DateFormatter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class portfolio {
    
    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;
    
    @OneToMany(mappedBy = "portfolio")
    private List<security> security;

    @Id
    @GeneratedValue()
    private long portfolioId;
    // private long clientId;

    @Column(nullable = false)
    private DateFormatter creationDate;


    protected portfolio()
    {

    }
    public portfolio(DateFormatter creationDate ) {
        this.creationDate= creationDate;
        
    }
    public Long getPortfolioId() {
        return portfolioId;
    }
    // public Long getClientId() {
    //     return clientId;
    // }

  
    public DateFormatter getCreationDate() {
        return creationDate;
}

public void setCreationDate(DateFormatter creationDate) {
    this.creationDate = creationDate;
}
}