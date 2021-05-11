package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Eau;
import fr.pokemon.model.Pokemon;

public class Tortank extends Pokemon implements Eau {
    public Tortank(String nom) {
        super(nom);
        this.setAttaque(8);
        this.setDefense(8);
        this.setPdv(160);
    }

    @Override
    public int pistoletAEau() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int vibraqua() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int bulleDeau() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int hydrocanon() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}