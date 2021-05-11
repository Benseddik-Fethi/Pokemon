package fr.pokemon.model.donjon;

import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.interfaces.IDonjon;
import fr.pokemon.model.Dresseur;
import fr.pokemon.model.Pokemon;
import fr.pokemon.model.pokemon.Carabaffe;
import fr.pokemon.model.pokemon.Salameche;

import java.util.HashMap;

public class ileAuCorbeaux implements IDonjon {
    private int id;
    private String nom;
    private int niveau = 1;
    private HashMap<Integer, Pokemon> pokemonMap;

    @Override
    public void enter(Dresseur dresseur) throws NiveauTropBasException {
        if(dresseur.getNiveau()<niveau){
            throw new NiveauTropBasException(" niveau trop bas");
        }else{
            donjon.enter(dresseur);
        }
    }
    public HashMap<Integer, Pokemon> initialiseDonjon() {

        Pokemon salameche = new Salameche("Salameche", niveau);

        pokemonMap.put(1, salameche);

        return pokemonMap;
    }
    public boolean combat(Pokemon pokemon1, Pokemon pokemon2) {
        boolean isWin = false;
        return false;
    }

}
