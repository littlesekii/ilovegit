package com.littlesekii;

import com.littlesekii.model.Pokedex;
import com.littlesekii.model.Pokemon;
import com.littlesekii.model.pokemon.Pikachu;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println("===========================");

        Pokedex dex = new Pokedex();
        dex.addPokemon(new Pikachu());
        dex.addPokemon(new Pokemon("Jolteon"));

        for (Pokemon p : dex.getPokemonList()) {
            System.out.println(p.getName());
            p.cry();
        }


    }
}
