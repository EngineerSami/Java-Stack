package com.axsos.dojoandninjas.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ninjas")
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String firstName;

    @Column(nullable = false, length = 255)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dojo_id")
    private Dojo dojo;

    public Ninja() {
        this.createdAt = LocalDateTime.now(); 
        this.updatedAt = LocalDateTime.now(); 
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.updatedAt = LocalDateTime.now(); 
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.updatedAt = LocalDateTime.now(); 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.updatedAt = LocalDateTime.now(); 
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Dojo getDojo() {
        return dojo;
    }

    public void setDojo(Dojo dojo) {
        this.dojo = dojo;
    }

    // Lifecycle callback methods
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
}