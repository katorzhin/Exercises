package polymorphism.Task.entities;

import polymorphism.Task.utils.FlowersLoader;

public class Flower {

    private int price;

    public Flower() {
        price = FlowersLoader.loadPrice(this.getClass().getSimpleName());
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
