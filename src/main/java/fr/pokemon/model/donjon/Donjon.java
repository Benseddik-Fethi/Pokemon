package fr.pokemon.model.donjon;

import fr.pokemon.interfaces.IDonjon;
import fr.pokemon.model.Dresseur;
import fr.pokemon.model.Pokemon;
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
