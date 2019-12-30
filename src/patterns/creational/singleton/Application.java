package patterns.creational.singleton;

public class Application {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yo-ho-ho!)" + "\n" +
                "If you see different values, then 2 singletons were created (ah-ha-ha!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FEE");
        Singleton anotherSingleton = Singleton.getInstance("YO");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}