package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Poison;
import fr.pokemon.model.Pokemon;

public class Nidorino extends Pokemon implements Poison {
    public Nidorino(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(6);
        this.setPdv(120);
    }

    public Nidorino(String nom, int niveau) {
        super(nom, niveau);
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
