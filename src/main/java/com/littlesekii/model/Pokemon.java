package com.littlesekii.model;

public class Pokemon implements IPokemon {

    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }     

    @Override
    public void cry() {
        throw new UnsupportedOperationException("Unimplemented method 'cry'");
    }
}
