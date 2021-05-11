package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Electrique;
import fr.pokemon.model.Pokemon;

public class Pikachu extends Pokemon implements Electrique {
    public Pikachu(String nom) {
        super(nom);
    }
}
