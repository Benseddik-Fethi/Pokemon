package fr.pokemon.model.donjon;

import fr.pokemon.exception.NiveauTropBasException;
import fr.pokemon.interfaces.IDonjon;
import fr.pokemon.model.Dresseur;
import fr.pokemon.model.Pokemon;
import fr.pokemon.model.pokemon.*;

import java.util.HashMap;

public class ileAuCorbeaux implements IDonjon {
    private int id;
    private String nom;
    private int niveau = 1;
    private final Donjon ileAuCorbeaux;

    public ileAuCorbeaux(Donjon ileAuCorbeaux) {
        this.ileAuCorbeaux = ileAuCorbeaux;
    }

    private HashMap<Integer, Pokemon> pokemonMap;

    @Override
    public void enter(Dresseur dresseur) throws NiveauTropBasException {
        if(dresseur.getNiveau() < niveau){
            throw new NiveauTropBasException(" niveau trop bas");
        }else{
            ileAuCorbeaux.enter(dresseur);
        }
    }
    public HashMap<Integer, Pokemon> initialiseDonjon() {

        Pokemon salameche = new Salameche("Salameche", niveau);
        Pokemon abo = new Abo("Abo", niveau);
        Pokemon aspicot = new Aspicot("Aspicot", niveau);
        Pokemon bulbizarre = new Bulbizarre("Bulbizarre", niveau);
        Pokemon carapuce = new Carapuce("Carapuce", niveau);
        Pokemon chenipan = new Chenipan("chenipan", niveau);
        Pokemon chrysacier = new Chrysacier("Chrysacier", niveau);
        Pokemon coconfort = new Coconfort("Coconfort", niveau);
        Pokemon feunard = new Feunard("Feunard", niveau);
        Pokemon goupix = new Goupix("Goupix", niveau);


        pokemonMap.put(1, salameche);
        pokemonMap.put(2, abo);
        pokemonMap.put(3, aspicot);
        pokemonMap.put(4, bulbizarre);
        pokemonMap.put(5, carapuce);
        pokemonMap.put(6, chenipan);
        pokemonMap.put(7, chrysacier);
        pokemonMap.put(8, coconfort);
        pokemonMap.put(9, feunard);
        pokemonMap.put(10, goupix);

        return pokemonMap;
    }
    public boolean combat(Pokemon pokemon1, Pokemon pokemon2) {
        do{
            System.out.println(pokemon1.getNom()+" commence le combat avec "+pokemon2.getNom());
            pokemon2.setPdv(pokemon2.getPdv() - pokemon1.getAttaque());

            System.out.println(pokemon1 +" fait "+ pokemon1.getAttaque() +" de dégâts à "+ pokemon2.getNom() +" et "+ pokemon2 +" à maintenant "+ pokemon2.getPdv() +" de pv");

            pokemon1.setPdv(pokemon1.getPdv() - pokemon2.getAttaque());

            System.out.println(pokemon2.getNom() +" fait "+ pokemon2.getAttaque() +" de dégâts à "+
                    pokemon1.getNom() +" et "+ pokemon1.getNom() +" à maintent "+ pokemon1.getPdv() +" de pv");

        }while(pokemon1.getPdv() >= 1 || pokemon2.getPdv() >= 1);
        if(pokemon1.getPdv() < 1) {
            System.out.println(pokemon1.getNom() + " à perdu le combat");
        }else{
                System.out.println(pokemon2.getNom() + " has perdu le combat");
        }
        boolean isWin = false;
        return false;
    }
}
