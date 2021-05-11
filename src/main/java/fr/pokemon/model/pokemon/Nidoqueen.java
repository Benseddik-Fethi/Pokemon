package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Poison;
import fr.pokemon.model.Pokemon;

public class Nidoqueen extends Pokemon implements Poison {
    public Nidoqueen(String nom) {
        super(nom);
        this.setAttaque(8);
        this.setDefense(8);
        this.setPdv(160);
    }

    public Nidoqueen(String nom, int niveau) {
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
