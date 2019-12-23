package polymorphism.shape;

public class Circle extends Shape {

    public void draw() {
        System.out.println("Circle draw");
    }

    @Override
    public void erase() {
        System.out.println("circle erase");
    }
}
