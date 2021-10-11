import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // BALLOON GAME
        Scanner console = new Scanner(System.in);

        // 1. Instantiate three balloons of different colors.
        Balloon red = new Balloon("Red");
        Balloon yellow = new Balloon("yellow");
        Balloon green = new Balloon("green");
        boolean explode = false;
        do {

            System.out.println("Inflate? [y/n]: ");
            if (console.nextLine().equalsIgnoreCase("y")) {
                for (int i = 0; i < 10; i++) {
                    red.inflate();
                    yellow.inflate();
                    green.inflate();
                }
                // 2. If the user confirms an inflate, inflate each balloon.
            } if (red.isExploded()) {
                System.out.println("Red has exploded!");

            } if(yellow.isExploded()) {
                System.out.println("Yellow has exploded!");

            } if (green.isExploded()) {
                System.out.println("Green has exploded!");

            } else{
                return;
            }

            // 3. When one or more balloons explode, stop the loop.
        } while (false);

        // 4. Print the color of the winners (balloons that exploded).
    }
}
