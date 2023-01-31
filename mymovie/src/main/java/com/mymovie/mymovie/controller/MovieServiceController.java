package com.mymovie.mymovie.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.mymovie.mymovie.model.Acteur;
import com.mymovie.mymovie.model.Film;

@RestController
public class MovieServiceController {
    static List<Film> films = new ArrayList<Film>();
    static List<Acteur> acteurs = new ArrayList<Acteur>();

    /* Acteurs */
    Acteur vinDiesel = new Acteur("Mark Sinclair", "Vincent", "1967-07-18");
    Acteur diCaprio = new Acteur("DiCaprio", "Leonardo", "1974-11-11");

    /* Films */
    Film leLoupWallStreet = new Film("Le Loup de WallStreet", "Martin Scorsese", null, "2013-12-25");
    Film fastAndFurious9 = new Film("Fast & Furious 9", "Justin Lin", null, "2021-07-14");

    /* Set acteur à film et add à la liste */
    {
        leLoupWallStreet.setActeurPrincipale(diCaprio);
        films.add(this.leLoupWallStreet);
        fastAndFurious9.setActeurPrincipale(vinDiesel);
        films.add(this.fastAndFurious9);
    }

    /* Set film à acteur et add à la liste */
    {
        diCaprio.getFilmographie().add(leLoupWallStreet);
        acteurs.add(diCaprio);
        vinDiesel.getFilmographie().add(fastAndFurious9);
        acteurs.add(vinDiesel);
    }
}
