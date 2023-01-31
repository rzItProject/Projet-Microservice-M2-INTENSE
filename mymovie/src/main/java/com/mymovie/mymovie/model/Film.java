package com.mymovie.mymovie.model;

import java.util.Date;

public class Film {
    private String titre;
    private String realisateur;
    private Acteur acteurPrincipale;
    private String dateSortie;

    public Film() {

    }

    public Film(String titre, String realisateur, Acteur acteurPrincipale, String dateSortie) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.acteurPrincipale = acteurPrincipale;
        this.dateSortie = dateSortie;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public Acteur getActeurPrincipale() {
        return acteurPrincipale;
    }

    public void setActeurPrincipale(Acteur acteurPrincipale) {
        this.acteurPrincipale = acteurPrincipale;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    @Override
    public String toString() {
        return "Film [titre=" + titre + ", realisateur=" + realisateur + ", acteurPrincipale=" + acteurPrincipale
                + ", dateSortie=" + dateSortie + "]";
    }
}