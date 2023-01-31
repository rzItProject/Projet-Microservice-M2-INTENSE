# Projet-Microservice-M2-INTENSE

Je n'ai pas réussit à avancer le tp à partir du microservice mymovie en raison d'un bug que je n'ai pas réussi à comprendre.
Lorsque j'essaie d'ajouter un acteur principal à un film avec des setteurs le programme boucle sans raison et ne m'affiche pas le json souhaité:

Fichier: MovieServiceController.java

LeLoupWallStreet.setActeurPrincipale(diCaprio);
fastAndFurious9.setActeurPrincipale(vinDiesel);

## Acces au microservice Eureka server

http://localhost:8761


## Acces au Eureka client

http://localhost:3536

## Endpoints

http://localhost:3536/getActeurs
http://localhost:3536//getActeur/{name}

http://localhost:3536/getFilms
http://localhost:3536/getFilm/{titre}




