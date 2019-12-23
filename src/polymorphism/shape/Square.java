package polymorphism.shape;

public class Square extends Shape {

    public void draw() {
        System.out.println("square draw");
    }

    @Override
    public void erase() {
        System.out.println("square erase");
    }
}
