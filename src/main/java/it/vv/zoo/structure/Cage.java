package it.vv.zoo.structure;

import it.vv.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {

    public int height;
    public int width;
    public int depth;

    public Material material = Material.WOOD;

    public List<Animal> animals = new ArrayList<>();

    public Cage(int height, int width, int depth, Material material) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.material = material;
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            return;
        }
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        if (animal == null) {
            return;
        }

        animals.remove(animal);
    }

    @Override
    public String toString() {
        return "Cage{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", material=" + material +
                ", animals=" + animals.stream().map(animal -> animal.name).collect(Collectors.joining(",")) +
                '}';
    }
}
