package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Electrique;
import fr.pokemon.model.Pokemon;

public class Pikachu extends Pokemon implements Electrique {
    public Pikachu(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(7);
        this.setPdv(110);
    }

    public Pikachu(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public int eclair() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int tonerre() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int fatalFoudre() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int poingEclair() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
