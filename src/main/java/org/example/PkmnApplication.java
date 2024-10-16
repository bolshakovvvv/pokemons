package org.example;

import java.io.IOException;


public class PkmnApplication {
    public static void main(String[] args) throws IOException {

        CardImport cardImport = new CardImport("C:\\Users\\vladt\\IdeaProjects\\untitled38\\src\\main\\resources\\my_card.txt");
        Card pokemon = cardImport.createPokemon();
        System.out.println(pokemon);

//        CardExport cardExport = new CardExport();
//        cardExport.saveCard(pokemon);
//        Card deserializedPokemon = cardImport.loadCard("PikachuV.crd");

    }
}