package it.vv.zoo.animal;

import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public abstract class Animal {

    public int id;
    public String name = "default";
    public int age;
    public Sex sex = Sex.MALE;
    public Size size = Size.MEDIUM;
    public Position position = Position.STAND;

    public Animal(int id, String name, int age, Sex sex, Size size) {
        this.id = id;
        this.name = StringUtils.capitalize(name);;
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

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", size=" + size +
                '}';
    }
}
