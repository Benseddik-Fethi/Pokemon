package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Feu;
import fr.pokemon.model.Pokemon;

public class Feunard extends Pokemon implements Feu {
    public Feunard(String nom) {
        super(nom);
        this.setAttaque(9);
        this.setDefense(8);
        this.setPdv(150);
    }

    public Feunard(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(9);
        this.setDefense(8);
        this.setPdv(150+ (50 * niveau)) ;
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