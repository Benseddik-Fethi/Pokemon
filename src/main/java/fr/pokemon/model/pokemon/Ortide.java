package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Plante;
import fr.pokemon.model.Pokemon;

public class Ortide extends Pokemon  implements Plante {
    public Ortide(String nom) {
        super(nom);
        this.setAttaque(6);
        this.setDefense(7);
        this.setPdv(130);
    }

    public Ortide(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(6);
        this.setDefense(7);
        this.setPdv(130+ (50 * niveau)) ;
    }

    @Override
    public int tempeteVerte() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int fouetLianes() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int tranchHerbe() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int canonGraine() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}