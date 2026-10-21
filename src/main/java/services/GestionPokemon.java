package services;

import models.Pokemon;

import java.util.ArrayList;
import java.util.HashMap;

public class GestionPokemon {

    private ArrayList<Pokemon> pokemons;

    public GestionPokemon(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public int getTotalPokemon() {

        return pokemons.size();
    }

    public double getNivelMedio() {

        int suma = 0;

        for (Pokemon pokemon : pokemons) {
            suma += pokemon.getNivel();
        }

        return (double) suma / pokemons.size();
    }

    public double getPsMedio() {

        int suma = 0;

        for (Pokemon pokemon : pokemons) {
            suma += pokemon.getPs();
        }

        return (double) suma / pokemons.size();
    }

    public Pokemon getMayorNivel() {

        Pokemon mayor = pokemons.get(0);

        for (Pokemon pokemon : pokemons) {

            if (pokemon.getNivel() > mayor.getNivel()) {
                mayor = pokemon;
            }
        }

        return mayor;
    }

    public Pokemon getMayorPs() {

        Pokemon mayor = pokemons.get(0);

        for (Pokemon pokemon : pokemons) {

            if (pokemon.getPs() > mayor.getPs()) {
                mayor = pokemon;
            }
        }

        return mayor;
    }

    public HashMap<String, ArrayList<Pokemon>> getPokemonPorTipo() {

        HashMap<String, ArrayList<Pokemon>> tipos =
                new HashMap<>();

        for (Pokemon pokemon : pokemons) {

            if (!tipos.containsKey(pokemon.getTipo())) {

                tipos.put(
                        pokemon.getTipo(),
                        new ArrayList<>());
            }

            tipos.get(
                            pokemon.getTipo())
                    .add(pokemon);
        }

        return tipos;
    }
}