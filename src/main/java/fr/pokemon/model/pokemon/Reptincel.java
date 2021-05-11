package fr.pokemon.model.pokemon;
import fr.pokemon.interfaces.Feu;

import fr.pokemon.model.Pokemon;

public class Reptincel extends Pokemon implements Feu {
    public Reptincel(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(6);
        this.setPdv(125);
    }
    public Reptincel(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public int flameche() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int lanceFlamme() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int rebondiFeu() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int deflagration() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}