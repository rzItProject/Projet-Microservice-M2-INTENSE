package com.mymovie.mymovie.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Acteur {
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private List<Film> filmographie;

    public Acteur() {

    }

    public Acteur(String nom, String prenom, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.filmographie = new ArrayList<Film>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public List<Film> getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(List<Film> filmographie) {
        this.filmographie = filmographie;
    }

    @Override
    public String toString() {
        return "Acteur [nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", filmographie="
                + filmographie + "]";
    }
}
