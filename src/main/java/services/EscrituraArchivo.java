package services;

import models.Pokemon;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class EscrituraArchivo {

    public void generarInforme(
            GestionPokemon gestion,
            String ruta) {

        try (PrintWriter pw = new PrintWriter(ruta)) {

            pw.println("===========================");
            pw.println("INFORME DE POKEMON");
            pw.println("===========================");
            pw.println();

            pw.println("Total de Pokemon: "
                    + gestion.getTotalPokemon());

            pw.println();

            pw.printf(
                    "Nivel medio: %.2f%n",
                    gestion.getNivelMedio());

            pw.println();

            pw.printf(
                    "PS medios: %.2f%n",
                    gestion.getPsMedio());

            pw.println();

            Pokemon mayorNivel =
                    gestion.getMayorNivel();

            pw.println("Pokemon con mayor nivel:");
            pw.println(
                    mayorNivel.getNombre()
                            + " (Nivel "
                            + mayorNivel.getNivel()
                            + ")");

            pw.println();

            Pokemon mayorPs =
                    gestion.getMayorPs();

            pw.println("Pokemon con más PS:");
            pw.println(
                    mayorPs.getNombre()
                            + " (PS "
                            + mayorPs.getPs()
                            + ")");

            pw.println();
            pw.println("---------------------");
            pw.println("POKEMON POR TIPO");
            pw.println("---------------------");

            HashMap<String, ArrayList<Pokemon>> tipos =
                    gestion.getPokemonPorTipo();

            for (String tipo : tipos.keySet()) {

                pw.println();
                pw.println(
                        tipo + ": "
                                + tipos.get(tipo).size());

                for (Pokemon pokemon : tipos.get(tipo)) {

                    pw.println(
                            pokemon.getNombre());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}