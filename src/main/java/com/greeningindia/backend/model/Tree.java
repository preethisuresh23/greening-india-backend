package com.greeningindia.backend.model;

import jakarta.persistence.*;

@Entity
public class Tree {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String plantedBy;
    private double carbonSaved;

    // GETTERS & SETTERS

    public Long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPlantedBy() {
        return plantedBy;
    }

    public void setPlantedBy(String plantedBy) {
        this.plantedBy = plantedBy;
    }

    public double getCarbonSaved() {
        return carbonSaved;
    }

    public void setCarbonSaved(double carbonSaved) {
        this.carbonSaved = carbonSaved;
    }
}