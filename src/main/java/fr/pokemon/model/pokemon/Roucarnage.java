package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Vol;
import fr.pokemon.model.Pokemon;

public class Roucarnage extends Pokemon implements Vol {
    public Roucarnage(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(8);
        this.setPdv(160);
    }

    public Roucarnage(String nom, int niveau) {
        super(nom, niveau);
    }
    @Override
    public int tranchAir() {
        return (this.getNiveau()* this.getAttaque() * 1) /5;
    }

    @Override
    public int cuAiles() {
        return (this.getNiveau()* this.getAttaque() * 2) /5;
    }

    @Override
    public int picPic() {
        return (this.getNiveau()* this.getAttaque() * 3) /5;
    }

    @Override
    public int tornade() {
        return (this.getNiveau()* this.getAttaque() * 4) /5;
    }
}