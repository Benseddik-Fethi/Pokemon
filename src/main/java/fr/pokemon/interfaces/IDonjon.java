package fr.pokemon.interfaces;

import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.model.Dresseur;

public interface IDonjon {
    void enter(Dresseur dresseur) throws NiveauTropBasException;
}
