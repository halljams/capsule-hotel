import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {
        // SWITCH OPPOSITES
        // Given a word, print its opposite using a switch statement.
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = console.nextLine();
        String opposite = null;

        // 1. Re-implement Exercise08 using a switch statement.
        switch (word) {
            case "high":
                opposite = "low";
                System.out.printf("The opposite of %s is %s.",word ,opposite);
                break;
            case "big":
                opposite = "little";
                System.out.printf("The opposite of %s is %s.",word ,opposite);
                break;
            case "small":
                opposite = "large";
                System.out.printf("The opposite of %s is %s.",word ,opposite);
                break;
            case "jumbo":
                opposite = "shrimp";
                System.out.printf("The opposite of %s is %s.",word ,opposite);
                break;
            default:
                opposite = null;
                System.out.printf("I do not have the opposite for %s", word);
        }
    }
}
