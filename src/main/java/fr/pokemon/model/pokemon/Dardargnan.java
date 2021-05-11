package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Insecte;
import fr.pokemon.model.Pokemon;

public class Dardargnan extends Pokemon implements Insecte {
    public Dardargnan(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(8);
        this.setPdv(160);
    }

    public Dardargnan(String nom, int niveau) {
        super(nom, niveau);
    }
    @Override
    public int taillade() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int vampirisme() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int doubleDard() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int dardMortel() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
