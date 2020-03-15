package polymorphismTest;

public class Crows implements Birds {
    @Override
    public void toFly() {
        System.out.println("crow is flying");
    }

    @Override
    public void makeASound() {
        System.out.println("crow makes a sound: caaaar,caar,caar!");
    }
}
