package fr.pokemon.model;

public class PokemonFactory {

    public static Pokemon getInstance(String pokemon, String nom) {
        switch (pokemon){
            case "Salameche":
                return new Salameche(nom);
            case "Bulbizarre":
                return null;

            default:
                    return null;
        }
    }

}
