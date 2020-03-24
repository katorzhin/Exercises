package polymorphismTest;

public class Animal {
    public void run(){
        System.out.println("run");
    }
    public void sayHello(){
        System.out.println("hello");
    }
}
class Lion extends Animal {
    @Override
    public void run() {
        System.out.println("Lion runs ad a speed of 80 km/h ");
    }
}
class Cat extends Animal{
    @Override
    public void run() {
        System.out.println("Cat runs ad a speed of 20 km/h ");
    }
}
class Dog extends Animal{
    @Override
    public void run() {
        System.out.println("Dog runs ad a speed of 40 km/h ");
    }
}