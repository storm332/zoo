import it.vv.zoo.animal.Lion;
import it.vv.zoo.animal.Sex;

public class Zoo {

    public static void main(String[] args) {

        System.out.println("Insallare Strutture..");
        // installare le strutture

        // 1 - gabbie

        // 2 - biglietteria

        // 3 - magazzino

        // Riempi il magazzino

        // Riempi le gabbie
        Lion anacleto = new Lion(1, "anacleto");
        Lion palmiera = new Lion(2, "palmiera");

        System.out.println("è arrivato un leone: " + anacleto);
        System.out.println("Anacleto dice: " + anacleto.speak());
        System.out.println("è arrivato un leone: " + palmiera);
        System.out.println("Palmiera dice: " + palmiera.speak());


        // Assumi personale

        // Avvia lavoratori

        // apri biglietteria


    }

}
