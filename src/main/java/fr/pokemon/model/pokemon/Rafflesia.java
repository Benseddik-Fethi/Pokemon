package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Plante;
import fr.pokemon.model.Pokemon;

public class Rafflesia extends Pokemon implements Plante {
    public Rafflesia(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(10);
        this.setPdv(165);
    }

    public Rafflesia(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(7);
        this.setDefense(10);
        this.setPdv(165 + (50 * niveau)) ;
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