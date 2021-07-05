package it.vv.zoo.animal;

import it.vv.zoo.food.FoodType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Random;

public class Quokka extends Animal{

    private static String[] MALE_NAMES ={"gustavo", "piero", "alfonso",};
    private static String[] FEMALE_NAMES ={"zoe", "greta", "barbara" };

    public Quokka(int id) {
        super(id, "default");
        if (this.sex == Sex.FEMALE) {
            this.name = FEMALE_NAMES[new Random().nextInt(FEMALE_NAMES.length)];
        } else {
            this.name = MALE_NAMES[new Random().nextInt(MALE_NAMES.length)];
        }
    }

    @Override
    public Position move() {
        if (this.position != Position.LAID) {
            this.position = Position.LAID;
        }
        return this.position;
    }

    @Override
    public List<FoodType> canEat() {
        return List.of(FoodType.VEGETABLES, FoodType.FRUIT);
    }

    @Override
    public String speak() {
        return "sqit";
    }
}











