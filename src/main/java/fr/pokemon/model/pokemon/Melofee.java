package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Normal;
import fr.pokemon.model.Pokemon;

public class Melofee extends Pokemon implements Normal {
    public Melofee(String nom) {
        super(nom);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100);
    }

    public Melofee(String nom, int niveau) {
        super(nom, niveau);
    }

    @Override
    public int charge() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int furie() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int vengeance() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int ultralaser() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
