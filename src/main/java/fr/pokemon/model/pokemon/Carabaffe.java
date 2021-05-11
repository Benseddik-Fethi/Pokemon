package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Eau;
import fr.pokemon.model.Pokemon;

public class Carabaffe extends Pokemon implements Eau {
    public Carabaffe(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(6);
        this.setPdv(120);
    }

    public Carabaffe(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(7);
        this.setDefense(6);
        this.setPdv(120+ (50 * niveau)) ;
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
