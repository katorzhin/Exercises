package polymorphism.music;

public class Brass extends Instrument{
    @Override
    void play(Note n) {
        System.out.println("Brass.play "+n);
    }

    @Override
    String what() {
        return "brass";
    }

    @Override
    void adjust() {
        System.out.println("adjusting brass");;
    }
}
