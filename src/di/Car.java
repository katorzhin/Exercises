package di;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        Engine engine = new CarEngine();
        if (engine.isStart()) {
            System.out.println("Start!");
        }
    }

    public static void main(String[] args) {
        Car car = new Car(CarEngine)
    }
}
