import java.util.Scanner;

public class Exercise05 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the secret word: ");
        String secret = console.nextLine();

        // 1. Add decision statements so that:
        // If the secret work is tahini, print the message:
           // not needed String word = "tahini";
            if (!secret.equalsIgnoreCase("tahini")) {
            System.out.println("That's not quite right. Try again.");  }
            else System.out.println("You're correct. The secret word is \"tahini\"");
        //   You're correct. The secret word is "tahini".
        // Otherwise, print:
        //   That's not quite right. Try again.
    }
}
