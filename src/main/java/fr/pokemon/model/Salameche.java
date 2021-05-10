package fr.pokemon.model;


import fr.pokemon.interfaces.Feu;

public class Salameche extends Pokemon implements Feu {
    public Salameche(String nom) {
        super(nom);
        this.setAttaque(5);
        this.setDefense(4);
        this.setAttaquespe(6);
        this.setDefensespe(3);
        this.setPdv(100);
    }

    @Override
    public int flameche() {
        return (this.getNiveau()*20) /5;
    }

    @Override
    public int lanceFlamme() {
        return 0;
    }
}
