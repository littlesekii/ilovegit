package com.littlesekii;

import com.littlesekii.model.Pokedex;
import com.littlesekii.model.Pokemon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Pokedex dex = new Pokedex();
        dex.addPokemon(new Pokemon("Pikachu"));
        dex.addPokemon(new Pokemon("Jolteon"));

        for (Pokemon p : dex.getPokemonList()) {
            System.out.println(p.getName());
        }


    }
}
