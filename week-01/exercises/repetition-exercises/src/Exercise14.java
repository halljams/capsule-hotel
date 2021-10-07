import java.util.Scanner;
public class Exercise14 {

    public static void main(String[] args) {
        // 1. Collect a phrase from a user via the console.
        Scanner console = new Scanner(System.in);
        System.out.println("Give me a phrase: ");
        String phrase = console.nextLine();
        int count = 0;


        for(int i = 0; i < phrase.length(); i++) {
            if (Character.isDigit(phrase.charAt(i))) {
                count++;
            }

        } //System.out.println("There are " + count + " digits in the phrase.");
        System.out.printf("Number of digits in %s: %s%n", phrase, count);
        // 2. Count the number of digits in the phrase.
        // Hint: Character.isDigit
        // 3. Print the result.
    }
}

