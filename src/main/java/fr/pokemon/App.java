package fr.pokemon;


import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.model.*;
import fr.pokemon.model.donjon.Donjon;
import fr.pokemon.model.donjon.DonjonProxy;
import fr.pokemon.model.pokemon.Salameche;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        Salameche sal = new Salameche("toto");
        System.out.println(sal.getAttaque());
        System.out.println(sal.flameche());
        sal.gagnerXp(350);
        System.out.println(sal.getNiveau());
        System.out.println(sal.getExperience());
        System.out.println(sal.flameche());
        Pokemon pokemon = PokemonFactory.getInstance("Salameche", "tata");
        System.out.println(pokemon.getClass().getSimpleName());
        System.out.println(pokemon.getNom());
        HashMap<Integer, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put(1, sal);
        pokemonMap.put(2, pokemon);
        Donjon donjon = Donjon.builder().id(1).nom("test").pokemonMap(pokemonMap).build();
        System.out.println(donjon.getPokemonMap().get(2).getNom());
        Dresseur dresseur = new Dresseur("kevin");
        dresseur.getPokemonMap().put("Salameche", sal);
        dresseur.getPokedex().getPokemon().put("Salameche", sal);
        System.out.println(dresseur.getId());
        dresseur.getPokedex().finByName("Salameche");
        DonjonProxy donjonProxy = new DonjonProxy(donjon);
        try {
            donjonProxy.enter(dresseur);
        } catch (NiveauTropBasException e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("test");


    }
}
