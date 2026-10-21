package org.example;

import models.Pokemon;
import services.EscrituraArchivo;
import services.GestionPokemon;
import services.LecturaArchivo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        LecturaArchivo lectura = new LecturaArchivo();

        ArrayList<Pokemon> pokemons =
                lectura.leerPokemon("src/main/resources/pokemon.json");

        GestionPokemon gestion =
                new GestionPokemon(pokemons);

        EscrituraArchivo escritura =
                new EscrituraArchivo();

        escritura.generarInforme(
                gestion,
                "informe_pokemon.txt");

        System.out.println("Informe generado correctamente");
    }
}