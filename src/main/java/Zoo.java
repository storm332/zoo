import it.vv.zoo.animal.Lion;
import it.vv.zoo.animal.Quokka;
import it.vv.zoo.animal.Sex;

import java.sql.SQLOutput;

public class Zoo {

    public static void main(String[] args) {

        System.out.println("Insallare Strutture..");
        // installare le strutture

        // 1 - gabbie

        // 2 - biglietteria

        // 3 - magazzino

        // Riempi il magazzino

        // Riempi le gabbie
        Lion uno = new Lion(1);
        Lion due = new Lion(2);
        Lion tre = new Lion(3);
        Quokka quattro = new Quokka(4);

        System.out.println("è arrivato un leone: " + uno);
        System.out.println(uno.name + " dice: " + uno.speak());
        System.out.println("è arrivato un leone: " + due);
        System.out.println(due.name + " dice: " + due.speak());
        System.out.println("é arrivato un leone : " + tre);
        System.out.println(tre.name + " dice: " + tre.speak());
        System.out.println("é arrivato un quokka : " + quattro);
        System.out.println(quattro.name + " dice: " + quattro.speak());


        // Assumi personale

        // Avvia lavoratori

        // apri biglietteria


    }

}
