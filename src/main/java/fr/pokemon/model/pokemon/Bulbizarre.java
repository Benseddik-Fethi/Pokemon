package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Plante;
import fr.pokemon.model.Pokemon;

public class Bulbizarre extends Pokemon implements Plante {
    public Bulbizarre(String nom) {
        super(nom);
        this.setAttaque(4);
        this.setDefense(5);
        this.setPdv(100);
    }

    public Bulbizarre(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public int tempeteVerte() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int fouetLianes() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int tranchHerbe() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int canonGraine() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
