package com.mymovie.mymovie.model;

public class Acteur {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private Film filmographie;

    public Acteur() {
    }

    public Acteur(String nom, String prenom, String dateNaissance, Film filmographie) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.filmographie = filmographie;
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Film getFilmographie() {
        return filmographie;
    }

    public void setFilmographie(Film filmographie) {
        this.filmographie = filmographie;
    }

    @Override
    public String toString() {
        return "Acteur [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", filmographie="
                + filmographie + "]";
    }
}
