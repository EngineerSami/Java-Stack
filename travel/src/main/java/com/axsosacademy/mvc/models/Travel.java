package com.axsosacademy.mvc.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.util.Date;

@Entity
@Table(name = "Travels")
public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 3, max = 100)
    private String expenseName;

    @NotNull
    @Size(min = 3, max = 100)
    private String vendor;

    @NotNull
    @Min(0)
    @Max(300)
    private Double amount;

    @NotNull
    @Size(max = 500) 
    private String description; 

    @Column(updatable = false)
    private Date createdAt;

    private Date updatedAt;

    public Travel() {}

    public Travel(String expenseName, String vendor, Double amount, String description) {
        this.expenseName = expenseName;
        this.vendor = vendor;
        this.amount = amount;
        this.description = description; 
    }


    public Long getId() {
        return id;
    }

    public String getexpenseName() {
        return expenseName;
    }

    public void setexpenseName(String expenseName) {
        this.expenseName = expenseName;
    }

    public String getvendor() {
        return vendor;
    }

    public void setvendor(String vendor) {
        this.vendor = vendor;
    }

    public Double getamount() {
        return amount;
    }

    public void setamount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description; 
    }

    public void setDescription(String description) {
        this.description = description; 
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = new Date();
    }
}