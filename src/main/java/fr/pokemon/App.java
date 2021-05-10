package fr.pokemon;


import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.model.*;

import java.util.HashMap;

public class App
{
    public static void main( String[] args ) {


        Salameche sal = new Salameche("toto");
        System.out.println(sal.getAttaque());
        System.out.println(sal.flameche());
        sal.gagnerXp(150);
        System.out.println(sal.getNiveau());
        System.out.println(sal.getExperience());
        System.out.println(sal.flameche());

        Pokemon pokemon = PokemonFactory.getInstance("Salameche", "tata");
        System.out.println(pokemon.getClass());
        System.out.println(pokemon.getNom());

        HashMap<Integer, Pokemon> pokemonMap = new HashMap<>();
        pokemonMap.put(1, sal);
        pokemonMap.put(2,pokemon);
        Donjon donjon = Donjon.builder().id(1).nom("test").pokemonMap(pokemonMap).build();

        System.out.println(donjon.getPokemonMap().get(2).getNom());
HashMap<String, Pokemon> pokemonList = new HashMap<>();
pokemonList.put("Salameche", sal);
        Dresseur dresseur = Dresseur.builder().id(1).name("Kevin").niveau(1).pokemonMap(pokemonList).build();
        DonjonProxy donjonProxy = new DonjonProxy(donjon);
        try {
            donjonProxy.enter(dresseur);
        } catch (NiveauTropBasException e) {
            e.printStackTrace();
            e.getMessage();
        }


    }
}
