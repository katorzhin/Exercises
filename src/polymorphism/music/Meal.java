package polymorphism.music;

public class Meal {
    String s ="2";
    Meal(String s){
        this.s = s;
        System.out.println("created s "+s);
    }
    public static void main(String[] args) {
        Meal meal = new Meal("sd");
    }
}
