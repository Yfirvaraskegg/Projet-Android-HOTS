package com.example.hots;

import com.google.gson.annotations.SerializedName;

public class Persos {
    private String nom;
    private String univers;
    private String role;
    private String difficulte;
    private String talent2;
    private String talent3;
    private String talent3_0;
    private String talent2_0;
    private String talent1_0;
    private String ultime1_0;
    private String ultime2_0;
    private String description1;
    private String description2;
    private String banniere;

    public String getBanniere() {
        return banniere;
    }

    public String getTalent3_0() {
        return talent3_0;
    }

    public String getTalent2_0() {
        return talent2_0;
    }

    public String getTalent1_0() {
        return talent1_0;
    }

    public String getUltime1_0() {
        return ultime1_0;
    }

    public String getUltime2_0() {
        return ultime2_0;
    }

    private String description3;
    private String nom0;
    private String univers0;
    private String role0;
    private String passif;
    private String descriptionp;
    private String ultime1;
    private String descriptionu1;
    private String ultime2;
    private String description_u2;
    private String passif0;

    public String getPassif0() {
        return passif0;
    }

    public String getUnivers0() {
        return univers0;
    }

    public String getRole0() {
        return role0;
    }



    public String getDescriptionp() {
        return descriptionp;
    }

    public String getDescriptionu1() {
        return descriptionu1;
    }

    public String getDescriptionu2() {
        return description_u2;
    }

    public String getNom0() {
        return nom0;
    }
    private String talent1;

    public String getTalent1() {
        return talent1;
    }

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
    public Persos(String nom, String univers, String role){
        this.nom=nom;
        this.univers=univers;
        this.role=role;
    }
}
