package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Sol;
import fr.pokemon.model.Pokemon;

public class Sabelette extends Pokemon implements Sol {
    public Sabelette(String nom) {
        super(nom);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100);
    }

    public Sabelette(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100+ (50 * niveau)) ;
    }
    @Override
    public int tunnel() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int cavalerieLourde() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int telluriForce() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int seisme() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}
