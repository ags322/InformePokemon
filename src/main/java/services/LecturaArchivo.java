package services;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Pokemon;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class LecturaArchivo {

    public ArrayList<Pokemon> leerPokemon(String ruta) {

        ObjectMapper mapper = new ObjectMapper();

        try {

            Pokemon[] pokemonArray =
                    mapper.readValue(
                            new File(ruta),
                            Pokemon[].class);

            return new ArrayList<>(
                    Arrays.asList(pokemonArray));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}