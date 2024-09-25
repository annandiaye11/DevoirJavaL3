package com.devoirjava.data.entities;

import lombok.Data;

@Data
public class Rv {
    private int id;
    private String date;
    private String heure;
    public Rv(String date, String heure) {
        this.date = date;
        this.heure = heure;
    }
}
