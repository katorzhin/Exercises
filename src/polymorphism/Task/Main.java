package polymorphism.Task;

import polymorphism.Task.entities.Chamomile;
import polymorphism.Task.entities.Flower;
import polymorphism.Task.entities.Rose;
import polymorphism.Task.entities.Tulip;
import polymorphism.Task.utils.FlowersLoader;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower tulip = new Tulip();
        Flower chamomile = new Chamomile();

        System.out.println(rose.getPrice());
        System.out.println(tulip.getPrice());
        System.out.println(chamomile.getPrice());

        FlowerStore flowerStore = new FlowerStore();

        String fileName1 = "files\\Bouquet1.txt";
        String fileName2 = "files\\Bouquet2.txt";

        Flower[] bouquet1 = FlowersLoader.load(fileName1);
        Flower[] bouquet2 = FlowersLoader.load(fileName2);
        flowerStore.showBouquet(bouquet1);
        flowerStore.showBouquet(bouquet2);
    }
}
