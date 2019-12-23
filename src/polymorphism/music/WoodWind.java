package polymorphism.music;

public class WoodWind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("WoodWind.play "+n);
    }

    @Override
    String what() {
        return "WoodWind";
    }

    @Override
    void adjust() {
        System.out.println("adjusting woodWind");;
    }
}
