package it.vv.zoo.animal;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Quokka {

    private static String[] MALE_NAMES ={"gustavo", "piero", "alfonso",};
    private static String[] FEMALE_NAMES ={"zoe", "greta", "barbara" };

    public int id;
    public String name = "default";
    public int age;
    public Sex sex = Sex.MALE;
    public int aggressivity = 0; // livello di aggressività

    public Quokka(int id) {
        this(id, "default");
        if (this.sex == Sex.FEMALE) {
            this.name = FEMALE_NAMES[new Random().nextInt(FEMALE_NAMES.length)];
        } else {
            this.name = MALE_NAMES[new Random().nextInt(MALE_NAMES.length)];
        }
    }

    public Quokka(int id, String name) {
        this(id, name, new Random().nextInt(15) + 1, Sex.values()[new Random().nextInt(2)]);
    }

    public Quokka(int id, String name, int age, Sex sex) {

        this.id = id;
        this.name = StringUtils.capitalize(name);
        this.age = age;

        this.sex = sex;

        this.aggressivity = new Random().nextInt(10) + 1;
    }

    @Override
    public String toString() {
        return "Quokka{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", aggressivity=" + aggressivity +
                '}';
    }

    public String speak() {
        String phrase = "sqit";

        if (aggressivity >= 5) {
            phrase = "addio figlio";
        }

        return phrase;
    }
}











