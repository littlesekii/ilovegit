package com.littlesekii.model;

import java.util.ArrayList;
import java.util.List;

public class Pokedex {
    
    
    private List<Pokemon> pokemonList;

    public Pokedex() {
        pokemonList = new ArrayList<>();
    }

    public void addPokemon(Pokemon p) {
        pokemonList.add(p);
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }
}
