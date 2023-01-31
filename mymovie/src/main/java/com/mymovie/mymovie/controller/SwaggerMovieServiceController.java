package com.mymovie.mymovie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymovie.mymovie.model.Acteur;
import com.mymovie.mymovie.model.Film;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "SwaggerMovieServiceController", description = "REST Apis related to Film and Acteur Entity")
@RestController
public class SwaggerMovieServiceController {
    List<Film> films = new ArrayList<Film>();
    List<Acteur> acteurs = new ArrayList<Acteur>();

    {
        /* Creation Acteurs */
        Acteur vinDiesel = new Acteur("Mark Sinclair", "Vincent", "1967-07-18", null);
        Acteur diCaprio = new Acteur("DiCaprio", "Leonardo", "1974-11-11", null);

        /* Creation Films */
        Film leLoupWallStreet = new Film("Le Loup de WallStreet", "Martin Scorsese", null, "2013-12-25");
        Film fastAndFurious9 = new Film("Fast & Furious 9", "Justin Lin", null, "2021-07-14");

        diCaprio.setFilmographie(leLoupWallStreet);
        vinDiesel.setFilmographie(fastAndFurious9);

        // leLoupWallStreet.setActeurPrincipale(diCaprio);
        // fastAndFurious9.setActeurPrincipale(vinDiesel);

        acteurs.add(diCaprio);
        acteurs.add(vinDiesel);

        films.add(leLoupWallStreet);
        films.add(fastAndFurious9);
    }

    @ApiOperation(value = "Get list of actors in the System ", response = Iterable.class, tags = "getActeurs")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Suceess|OK"),
        @ApiResponse(code = 401, message = "not authorized!"), 
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!") })
    @GetMapping("/getActeurs")
    public List<Acteur> getActeurs() {
        return this.acteurs;
    }

    @ApiOperation(value = "Get specific actors in the System ", response = Acteur.class, tags = "getActeur")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Suceess|OK"),
        @ApiResponse(code = 401, message = "not authorized!"), 
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(value = "/getActeur/{name}")
	public Acteur getActeur(@PathVariable(value = "name") String name) {
        System.out.println("Getting Student details for " + name);

        Acteur std = new Acteur("N/A", "N/A", "N/A", null);
        for (Acteur student : this.acteurs) {
            if (student.getNom().equals(name)) {
                std = student;
            }
        }
        return std;
	}

    @ApiOperation(value = "Get list of films in the System ", response = Iterable.class, tags = "getFilms")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Suceess|OK"),
        @ApiResponse(code = 401, message = "not authorized!"), 
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!") })
    @GetMapping("/getFilms")
    public List<Film> getFilms() {
        return this.films;
    }

    @ApiOperation(value = "Get specific film in the System ", response = Film.class, tags = "getFilm")
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Suceess|OK"),
        @ApiResponse(code = 401, message = "not authorized!"), 
        @ApiResponse(code = 403, message = "forbidden!!!"),
        @ApiResponse(code = 404, message = "not found!!!") })
	@RequestMapping(value = "/getFilm/{titre}")
	public Film getFilml(@PathVariable(value = "name") String titre) {
        System.out.println("Getting Student details for " + titre);

        Film f = new Film("N/A", "N/A", null, "N/A");
        for (Film film : this.films) {
            if (film.getTitre().equals(titre)) {
                f = film;
            }
        }
        return f;
	}
}
