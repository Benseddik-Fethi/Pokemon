package fr.pokemon.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Dresseur {
    private int id;
    private String name;
    private HashMap<String, Pokemon> pokemonMap;
    private int niveau;
}
