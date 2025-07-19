package com.littlesekii.model.pokemon;

import com.littlesekii.model.Pokemon;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("Pikachu");
    }

    @Override
    public void cry() {
        System.out.println("Pika, pika!");
    }
}
