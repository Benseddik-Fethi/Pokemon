package fr.pokemon.model;

import fr.pokemon.interfaces.IDonjon;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Donjon implements IDonjon {
    private int id;
    private String nom;
    private HashMap<Integer, Pokemon> pokemonMap;

    @Override
    public void enter(Dresseur dresseur) {
        System.out.println("on est rentré par ici");
    }
}
