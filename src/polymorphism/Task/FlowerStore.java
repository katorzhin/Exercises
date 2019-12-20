package polymorphism.Task;

import polymorphism.Task.entities.Chamomile;
import polymorphism.Task.entities.Flower;
import polymorphism.Task.entities.Rose;
import polymorphism.Task.entities.Tulip;

import java.util.ArrayList;

public class FlowerStore {
    int wallet;

    public Flower[] sell(int roses, int chamomiles, int tulips) {
        Flower[] bouquet = new Flower[roses + chamomiles + tulips];
        for (int i = 0; i < roses; i++) {
            bouquet[i] = new Rose();
            wallet += bouquet[i].getPrice();
        }
        for (int i = roses; i < bouquet.length - tulips; i++) {
            bouquet[i] = new Chamomile();
            wallet += bouquet[i].getPrice();
        }
        for (int i = roses + chamomiles; i < bouquet.length; i++) {
            bouquet[i] = new Tulip();
            wallet += bouquet[i].getPrice();
        }
        return bouquet;
    }

    public Flower[] sellSequence(int roses, int chamomiles, int tulips) {
        ArrayList<Flower> bouquet = new ArrayList<>();
        while (roses + tulips + chamomiles > 0) {
            if (roses > 0) {
                Rose rose = new Rose();
                bouquet.add(rose);
                wallet += rose.getPrice();
                roses--;
            }
            if (chamomiles > 0) {
                Chamomile chamomile = new Chamomile();
                bouquet.add(chamomile);
                wallet += chamomile.getPrice();
                chamomiles--;
            }
            if (tulips > 0) {
                Tulip tulip = new Tulip();
                bouquet.add(tulip);
                wallet += tulip.getPrice();
                tulips--;
            }
        }
        return bouquet.toArray(new Flower[bouquet.size()]);
    }

    void showBouquet(Flower[] bouquet) {
        if (bouquet.length == 0)
            System.out.println("There are no flowers in bouquet.");
        else {
            for (int i = 0; i < bouquet.length; i++) {
                if (i == bouquet.length - 1)
                    System.out.println(bouquet[i].getClass().getSimpleName());
                else System.out.println(bouquet[i].getClass().getSimpleName() + ", ");
            }
        }
    }

}
