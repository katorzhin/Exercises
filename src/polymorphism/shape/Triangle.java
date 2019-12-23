package polymorphism.shape;

public class Triangle extends Shape {
    
    public void draw() {
        System.out.println("triangle draw");
    }

    @Override
    public void erase() {
        System.out.println("triangle erase");
    }
}
