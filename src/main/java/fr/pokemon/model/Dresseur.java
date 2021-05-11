package fr.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dresseur {
    private UUID id;
    private String name;
    private HashMap<String, Pokemon> pokemonMap;
    private int niveau;
    private Pokedex pokedex;

    public Dresseur(String name) {
        this.name = name;
        this.pokedex = new Pokedex();
        this.niveau = 1;
        this.pokemonMap = new HashMap<>();
        this.id = UUID.randomUUID();
    }
}
