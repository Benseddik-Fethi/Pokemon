package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Insecte;
import fr.pokemon.model.Pokemon;

public class Coconfort extends Pokemon implements Insecte {
    public Coconfort(String nom) {
        super(nom);
        this.setAttaque(2);
        this.setDefense(10);
        this.setPdv(150);
    }
    public Coconfort(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(2);
        this.setDefense(10);
        this.setPdv(150+ (50 * niveau)) ;
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
