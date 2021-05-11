package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Electrique;
import fr.pokemon.model.Pokemon;

public class Raichu extends Pokemon implements Electrique {
    public Raichu(String nom) {
        super(nom);
    }
}
