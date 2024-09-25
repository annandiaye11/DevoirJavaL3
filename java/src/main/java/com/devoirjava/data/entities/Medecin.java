package com.devoirjava.data.entities;

import lombok.Data;

@Data
public class Medecin {
    private int id;
    private String nom;
    private String prenom;
    public Medecin(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
}
