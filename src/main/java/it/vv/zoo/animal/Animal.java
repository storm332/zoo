package it.vv.zoo.animal;

import it.vv.zoo.food.Food;
import it.vv.zoo.food.FoodType;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Random;

public abstract class Animal {

    public static int MAX_HEALTH = 100;
    public static int HEALTH_PER_MOVEMENT = 10;

    public int id;
    public String name = "default";
    public int age;
    public Sex sex = Sex.MALE;
    public Size size = Size.MEDIUM;
    public Position position = Position.STAND;
    public int health = MAX_HEALTH;


    public Animal(int id, String name, int age, Sex sex, Size size) {
        this.id = id;
        this.name = StringUtils.capitalize(name);
        this.age = age;
        this.sex = sex;
        this.size = size;
    }


    public Animal(int id, String name) {
        this(id, name,
                new Random().nextInt(50) + 1,
                Sex.values()[new Random().nextInt(Sex.values().length)],
                Size.values()[new Random().nextInt(Size.values().length)]);
    }


    public abstract String speak();

    public abstract Position move();

    public abstract List<FoodType> canEat();

    public void feed(Food food) {

        if (!canEat().contains(food.type)) {
            System.out.println(this.name + " cannot eat " + food.type);
            return;
        }

        if (health >= 100) {
            return;
        }

        health = health + food.value;

        if (health > 100) {
            health = 100;
        }

    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", size=" + size +
                ", health=" + health +
                '}';
    }
}
