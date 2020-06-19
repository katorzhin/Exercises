package tasksCodeWars;

public class SolutionPartTwo {
    public static int Past(int h, int m, int s) {
        int second = 1000;
        int minutes = 60_000;
        int hour = 3_600_000;
        int sum = h * hour + m * minutes + s * second;
        return sum;
    }

    public static int points(String[] games) {
        int res = 0;
        for (String game : games) {
            String[] split = game.split(":");
            int player1 = Integer.parseInt(split[0]);
            int player2 = Integer.parseInt(split[1]);
            if (player1 > player2) {
                res += 3;
            } else if (player1 == player2) {
                res += 1;
            }
        }
        return res;
    }
}
