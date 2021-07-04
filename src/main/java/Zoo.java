import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.lang3.stream.Streams;

import it.vv.zoo.animal.Lion;
import it.vv.zoo.animal.Quokka;

public class Zoo {

    private static int NUMBER_OF_LIONS = 10;
    private static int NUMBER_OF_QUOKKA = 3;

    public static void main(String[] args) {

        System.out.println("Insallare Strutture..");
        // installare le strutture

        // 1 - gabbie

        // 2 - biglietteria

        // 3 - magazzino

        // Riempi il magazzino

        // Riempi le gabbie
        IntStream.range(1, NUMBER_OF_LIONS + 1).forEach(id -> {
            Lion lion = new Lion(id);
            System.out.println("E' arrivato un Leone: " + lion);
            System.out.println(lion.name + " dice: " + lion.speak());
        });

        for (int id = 1; id <= NUMBER_OF_QUOKKA; id++) {
            Quokka quokka = new Quokka(id);
            System.out.println("E' arrivato un Quokka: " + quokka);
            System.out.println(quokka.name + " dice: " + quokka.speak());
        }


        // Assumi personale

        // Avvia lavoratori

        // apri biglietteria


    }

}
