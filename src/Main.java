
public class Main {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("You got a score less than 5000");
        } else {
            System.out.println("You got a score greater than 5000");
        }
    }
}