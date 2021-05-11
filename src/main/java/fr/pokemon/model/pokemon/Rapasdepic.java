package fr.pokemon.model.pokemon;

import fr.pokemon.interfaces.Vol;
import fr.pokemon.model.Pokemon;

public class Rapasdepic extends Pokemon implements Vol {
    public Rapasdepic(String nom) {
        super(nom);
        this.setAttaque(7);
        this.setDefense(8);
        this.setPdv(160);
    }

    public Rapasdepic(String nom, int niveau) {
        super(nom, niveau);
        this.setAttaque(7);
        this.setDefense(8);
        this.setPdv(160 + (50 * niveau)) ;
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