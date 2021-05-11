package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Normal;
import fr.pokemon.model.Pokemon;

public class Melodelfe extends Pokemon implements Normal {
    public Melodelfe(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(8);
        this.setPdv(160);
    }
    public Melodelfe(String nom, int niveau) {
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