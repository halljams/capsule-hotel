import java.util.Scanner;

public class Exercise14 {
    public static String readAnswer(String prompt) {
        Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.print(prompt);
            result = console.nextLine();
            if (result.isBlank()) {
                System.out.println("Error: Can not be blank.");
            }
        } while (result.isBlank());
        return result;
    }
    public static int intAnswer(String prompt2) {
        String result;
        result = readAnswer(prompt2);
        /* Scanner console = new Scanner(System.in);
        String result;

        do {
            System.out.print(prompt2);
            result = console.nextLine();
        } while (result.isBlank());

        */
        return Integer.parseInt(result);

    }

    public static void main(String[] args) {
        String firstName = readAnswer("What is your first name?: ");
        String lastName = readAnswer("What is your last name?: ");
        int numCities = intAnswer("How many cities have you lived in?: ");
        int numInstrument = intAnswer("How many instruments can you play?: ");

        System.out.println("First name : " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Lived in " + numCities + " cities.");
        System.out.println("Can play " + numInstrument + " instruments.");
       // System.out.printf("%s %s has lived in %s towns and plays %s instruments.",
       //         firstName,lastName, numCities, numInstrument);
    }



    /* SHORT SURVEY

    Write a program that asks a user four questions and prints the results:
    - What is your first name?
    - What is your last name?
    - How many towns/cities have you lived in?
    - How many musical instruments can you play?

    Store each answer in a variable with an appropriate type.
    Print the results after the user has answered all four questions.

    Use methods to break the program into reusable blocks of code.
     */
}
