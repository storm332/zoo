import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import it.vv.zoo.animal.Animal;
import it.vv.zoo.animal.Sex;
import it.vv.zoo.food.Food;
import it.vv.zoo.food.FoodType;
import it.vv.zoo.structure.Cage;
import it.vv.zoo.structure.Material;
import org.apache.commons.lang3.stream.Streams;

import it.vv.zoo.animal.Lion;
import it.vv.zoo.animal.Quokka;

public class Zoo {

    private static int NUMBER_OF_LIONS = 2;
    private static int NUMBER_OF_QUOKKA = 2;

    public static void main(String[] args) {

        System.out.println("Insallare Strutture..");
        // installare le strutture

        // 1 - gabbie

        // 2 - biglietteria

        // 3 - magazzino

        // Riempi il magazzino
        Food chicken = new Food(5, "Chicken", FoodType.MEAT);
        Food grano = new Food(1, "Wheat", FoodType.VEGETABLES);
        Food apple = new Food(2, "Apple", FoodType.FRUIT);
        Food bass = new Food(6, "Bass", FoodType.FISH);
        List<Food> foods = List.of(chicken, grano, apple, bass);

        List<Animal> animals = new ArrayList<>();
        Cage lionsCage = new Cage(10,10,100, Material.IRON);

        // Riempi le gabbie
        IntStream.range(1, NUMBER_OF_LIONS + 1).forEach(id -> {
            Animal lion = new Lion(id);
            animals.add(lion);
            lionsCage.addAnimal(lion);
        });

        for (int id = 1; id <= NUMBER_OF_QUOKKA; id++) {
            animals.add(new Quokka(id));
        }

        animals.forEach(animal -> {
            System.out.println("E' arrivato un " + animal.getClass().getSimpleName() + " => " + animal);
            System.out.println(animal.name + " dice " + animal.speak());
        });


        Animal esempio = animals.get(0);
        for (int i = 0; i < 15; i++) {
            System.out.println("l'animale " + esempio.name + " è in posizione " + esempio.move());

            // randomly give food
            int dice = new Random().nextInt(100);

            if (dice <= 30) {
                Food givenFood = foods.get(new Random().nextInt(foods.size()));
                esempio.feed(givenFood);
                System.out.println("ha mangiato " + givenFood.name + " e adesso è a " + esempio.health);
            }
        }

        System.out.println(esempio.name + " has health = " + esempio.health);

        // chi c'e' nella gabbia dei leoni?
        System.out.println(lionsCage);

        // Assumi personale

        // Avvia lavoratori

        // apri biglietteria

        // cibo



    }

}
