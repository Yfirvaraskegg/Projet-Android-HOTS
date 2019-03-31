package com.example.hots;

import com.google.gson.annotations.SerializedName;

public class Persos {
    private String nom;
    private String univers;
    private String role;
    private String difficulte;

    private String talent2;
    private String talent3;

    private String description1;
    private String description2;
    private String description3;

    private String passif;
    private String descriptionp;

    private String ultime1;
    private String descriptionu1;

    private String ultime2;
    private String descriptionu2;

    @SerializedName("body")
    private String talent1;

    public String getNom() {
        return nom;
    }

    public String getUnivers() {
        return univers;
    }

    public String getRole() {
        return role;
    }

    public String getDifficulte() {
        return difficulte;
    }

    public String getTalent1() {
        return talent1;
    }
    public String getTalent2() {
        return talent2;
    }
    public String getTalent3() {
        return talent3;
    }
    public String getDescription1() {
        return description1;
    }
    public String getDescription2() {
        return description2;
    }
    public String getDescription3() {
        return description3;
    }
    public String getPassif() {
        return passif;
    }
    public String getDscriptionP() {
        return descriptionp;
    }
    public String getUltime1() {
        return ultime1;
    }
    public String getUltime2() {
        return ultime2;
    }
    public String getDescriptionUltime1() {
        return descriptionu1;
    }
    public String getDescriptionUltime2() {
        return descriptionu2;
    }
    public Persos(String nom, String univers, String role){
        this.nom=nom;
        this.univers=univers;
        this.role=role;
    }
}
