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
              //  for (int i = 0; i < 10; i++) {
                    red.inflate();
                    yellow.inflate();
                    green.inflate();
                }
                // 2. If the user confirms an inflate, inflate each balloon.

            // 3. When one or more balloons explode, stop the loop.
        } while (!(red.isExploded() || green.isExploded() || yellow.isExploded()));

        // 4. Print the color of the winners (balloons that exploded).
        printBalloon(red);
        printBalloon(yellow);
        printBalloon(green);

    }
    private static void printBalloon(Balloon balloon) {
        if(balloon.isExploded()) {
            System.out.printf("the %s balloon exploded%n", balloon.getColor());
        } else {
            System.out.printf("the %s balloon is at %s psi%n", balloon.getColor(), balloon.getPsi());
        }

    }
}
