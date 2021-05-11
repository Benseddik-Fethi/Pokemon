package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Vol;
import fr.pokemon.model.Pokemon;

public class Roucool extends Pokemon implements Vol {
    public Roucool(String nom) {
        super(nom);
        this.setAttaque(4);
        this.setDefense(4);
        this.setPdv(100);
    }

    public Roucool(String nom, int niveau) {
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
