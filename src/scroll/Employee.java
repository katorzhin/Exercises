package scroll;

import java.util.Scanner;

public class Employee {
    String name;
    static int experience;
    static final int TRAINEE_TO_JUNIOR = 4000;
    static final int JUNIOR_TO_MIDDLE = 5000;
    static final int MIDDLE_TO_SENIOR = 10000;
    static boolean check;

    public static void checkExperience(Scanner scanner) {
        System.out.println("Enter your experience: ...");
        experience = scanner.nextInt();

        if (experience >= TRAINEE_TO_JUNIOR && experience < JUNIOR_TO_MIDDLE) {
            System.out.println("Your position is " + LevelOfEmployee.JUNIOR);
        } else if (experience >= JUNIOR_TO_MIDDLE && experience < MIDDLE_TO_SENIOR) {
            System.out.println("Your position is: " + LevelOfEmployee.MIDDLE);
        } else if (experience >= MIDDLE_TO_SENIOR) {
            System.out.println("Your position: " + LevelOfEmployee.SENIOR);
        } else {
            System.out.println("You do not have enough experience!");
        }
    }

    public static boolean test(ComplexityOfTask complexityOfTask,Employee employee,int plannedTime,int timeSpentOnTime){
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkExperience(scanner);
    }
}
