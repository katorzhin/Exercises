package polymorphismTest;

public class Parrot implements Birds{
    @Override
    public void toFly() {
        System.out.println("parrot is flying");
    }

    @Override
    public void makeASound() {
        System.out.println("parrot makes a sound: gfdgjkdfkgdf!");
    }
}
