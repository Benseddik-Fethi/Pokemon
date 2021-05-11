package fr.pokemon.model;
import fr.pokemon.model.pokemon.*;
import lombok.Data;
import fr.pokemon.exception.EvolutionException;

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
            System.out.println("Nouveau niveau => " + this.niveau );
            gagnerXp(prorata);
        } else {
            this.experience += gainXp;
        }
    }

    private Pokemon evoluer(Pokemon pokemon) throws Exception{
       switch (pokemon.getClass().getSimpleName()){
           case "Salameche":
               return new Reptincel(pokemon.getNom());
           case "Reptincel":
               return new Dracaufeu(pokemon.getNom());
           case "Pikachi":
               return new Raichu(pokemon.getNom());
           case "Carapuce":
               return new Carabaffe(pokemon.getNom());
           case "Carabaffe":
               return new Tortank(pokemon.getNom());
           case "Bulbizarre":
               return new Herbizarre(pokemon.getNom());
           case "Herbizarre":
               return new Florizarre(pokemon.getNom()):
               default:
             throw new EvolutionException("Evolution impossible");

       }
    }
}
