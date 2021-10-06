import java.util.Scanner;
public class Exercisie09 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        System.out.println("Enter a minimum value: ");
        int valueMin = console.nextInt();
                System.out.println("Set a maximum value: ");
        int valueMax = console.nextInt();
                System.out.println("Choose a number within the range: ");
        int value = console.nextInt();

        if (value <= valueMax && value >= valueMin) {
            System.out.println("This value is within range.");
        } else
            System.out.println("This value is not in range.");
        //. Collect three pieces of data from the user: a minimum value, a maximum value, and an actual value.
        //5. Add `if/else` statements to determine if the actual value is between the min and max.
        //6. Print messages for both true and false cases.

    }
}
