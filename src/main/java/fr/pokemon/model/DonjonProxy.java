package fr.pokemon.model;

import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.interfaces.IDonjon;

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
