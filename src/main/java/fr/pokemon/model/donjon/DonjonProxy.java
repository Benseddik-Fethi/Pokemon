package fr.pokemon.model.donjon;

import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.interfaces.IDonjon;
import fr.pokemon.model.Dresseur;
import fr.pokemon.model.donjon.Donjon;

public class DonjonProxy implements IDonjon {

    private final Donjon donjon;

    public DonjonProxy(Donjon donjon) {
        this.donjon = donjon;
    }

    @Override
    public void enter(Dresseur dresseur) throws NiveauTropBasException {
        if(dresseur.getNiveau()<2){
            throw new NiveauTropBasException(" niveau trop bas");
        }else{
            donjon.enter(dresseur);
        }
    }
}
