package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Poison;
import fr.pokemon.model.Pokemon;

public class Nosferapti extends Pokemon implements Poison {
    public Nosferapti(String nom) {
        super(nom);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100);
    }

    public Nosferapti(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100+ (50 * niveau)) ;
    }

    @Override
    public int dardVenin() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int directToxik() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int acide() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int detriCanon() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
