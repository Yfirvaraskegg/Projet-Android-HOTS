package com.example.hots;

import com.google.gson.annotations.SerializedName;

public class Persos {
    private String nom;
    private String univers;
    private String role;
    private String difficulte;

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
}
