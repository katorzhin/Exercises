package polymorphismTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aibolit {
    public void healAnimal(Animal animal) {
        System.out.println("Animal is healthy");
        animal.run();
    }
}

class Main {
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Dog();

        aibolit.healAnimal(cat);
        aibolit.healAnimal(dog);
        aibolit.healAnimal(lion);
        List<Animal> animals = Arrays.asList(new Cat(),new Dog(),new Lion());
        animals.forEach(animal -> animal.run());

    }
}