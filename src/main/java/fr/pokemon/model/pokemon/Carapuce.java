package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Eau;
import fr.pokemon.model.Pokemon;

public class Carapuce extends Pokemon implements Eau {
    public Carapuce(String nom) {
        super(nom);
        this.setAttaque(5);
        this.setDefense(4);
        this.setPdv(100);
    }

    public Carapuce(String nom, int niveau) {
        super(nom, niveau);
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