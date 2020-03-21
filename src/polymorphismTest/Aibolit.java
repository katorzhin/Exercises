package polymorphismTest;

public class Aibolit {
    public void healAnimal(Animal animal){
        System.out.println("Animal is healthy");
        animal.run();
    }
}
class Test{
    public static void main(String[] args) {
        Aibolit aibolit = new Aibolit();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal lion = new Dog();

        aibolit.healAnimal(cat);
        aibolit.healAnimal(dog);
        aibolit.healAnimal(lion);
    }
}