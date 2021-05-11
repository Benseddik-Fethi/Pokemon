package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Electrique;
import fr.pokemon.model.Pokemon;

public class Raichu extends Pokemon implements Electrique {
    public Raichu(String nom) {
        super(nom);
        this.setAttaque(9);
        this.setDefense(8);
        this.setPdv(145);
    }

    public Raichu(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(9);
        this.setDefense(8);
        this.setPdv(145 + (50 * niveau)) ;
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