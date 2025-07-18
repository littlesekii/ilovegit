package com.littlesekii;

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
        System.out.println("~You are in the Dev branch.");
        System.out.println("===========================");

        Pokemon pokemon = new Pikachu();

        pokemon.cry();
    }
}
