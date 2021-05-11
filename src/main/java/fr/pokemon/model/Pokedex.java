package fr.pokemon.model;

import lombok.Data;

import java.util.HashMap;
@Data
public class Pokedex {
    HashMap<String, Pokemon> pokemon;

    public Pokedex() {
        this.pokemon = new HashMap<>();
    }

    public void finByName(String pokemonName){
        System.out.println(this.pokemon.get(pokemonName));
    }


}
