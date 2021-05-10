package fr.pokemon.model;
import lombok.Data;

@Data
public abstract class Pokemon {
    private int id;
    private String nom;
    private int pdv;
    private int attaque;
    private int defense;
    private int defensespe;
    private int attaquespe;
    private int niveau;
    private int experience;

    public Pokemon(String nom) {
        this.nom = nom;
        this.niveau = 1;
        this.experience = 0;
    }




    public void gagnerXp(int gainXp) {
        if (this.experience + gainXp >= 100) {
            int prorata = (this.experience + gainXp) -100;
            this.niveau++;
            this.experience = prorata;
            System.out.println("Nouveau niveau => " + this.niveau );
        } else {
            this.experience += gainXp;
        }
    }
}
