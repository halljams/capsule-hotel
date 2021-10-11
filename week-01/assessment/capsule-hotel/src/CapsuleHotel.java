import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CapsuleHotel {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean terminateProgram = false;
        int units;

        System.out.println("Welcome to Capsule-Capsule.");
        System.out.println("=".repeat(15));
        do {

            System.out.print("Enter the number of capsules available (minimum 11): ");
            units = console.nextInt();

        } while (units < 11);

        String[] roomNumbers = new String[units];
        for (int i = 0; i < units; i++) {
            roomNumbers[i] = "unoccupied";
        }

        System.out.println("There are " + units + " capsules ready to be booked.");
        int input;


        do {

            System.out.println("Guest Menu");
            System.out.println("=".repeat(15));
            System.out.println("1. Check in");
            System.out.println("2. Check out");
            System.out.println("3. View Guests");
            System.out.println("4. Exit");
            System.out.print("Choose an option [1-4]: ");

            input = console.nextInt();

            if (input == 1) {
                guestcheckIn(console, roomNumbers);
            } else if (input == 2) {
                guestCheckOut(roomNumbers);
            } else if (input == 3) {
                System.out.println("View Guests");
                System.out.println("=".repeat(15));
                viewGuests(roomNumbers);
            } else if (input == 4) {
                System.out.print("Do you wish to exit? \nAll data from this session will be lost.");
                System.out.print("[Y/N]");
                console.nextLine();
                if (console.nextLine() == "Y" || console.next() == "y") {
                    terminateProgram = true;
                } else {
                    System.out.println("Returning to Guest Menu.");
                }
            }


        } while (terminateProgram == false);
        System.out.println("Thank you for using our services!");
    }

 /*   public static String guestCheckInName(String prompt) {
        Scanner console = new Scanner(System.in);
        String name;
        do {
            System.out.println(prompt);
            name = console.nextLine();
            if (name.isBlank()) {
                System.out.println("Error: Cannot be blank");
            }
        } while (name.isBlank());
        return name;
    }
    */


    public static void guestcheckIn( Scanner console, String[] prompt) {
        String name;
        int units;
        do {
            System.out.println("Enter Guest Name: ");
            name = console.nextLine();
            if (name.isBlank()) {
                System.out.println("Error: Cannot be blank");
            }
        } while (name.isBlank());

        do{
            System.out.print("Choose a room: ");
            units = parseInt(console.nextLine()) - 1;
            if ((units < 1) || units >= prompt.length) {
                System.out.print("That room number is not in range.");
            }
            if (!prompt[units].equals("unoccupied")) {
                System.out.println("That room is taken. Pick another.");
            }
        } while (!prompt[units].equals(units));

        prompt[units] = name;

        System.out.printf("Guest name: %s%m Room#: %s", name, units);
    }

    public static void guestCheckOut(String[] prompt) {
        Scanner console = new Scanner(System.in);
        int units;

        do {
            System.out.print("What room would you like to check out of: ");
            units = (parseInt(console.nextLine()) - 1);
            if ((units < 1) || units >= prompt.length) {
                System.out.print("That room number is not in range.");
                if (prompt[units].equals("unoccupied")) {
                    System.out.println("That room is vacant. Please choose your room.");
                }
            }
        } while (!prompt[units].equals("unoccupied"));
        prompt[units] = "unoccupied";
        System.out.printf("You have signed out of room: %s", prompt[units]);
    }


    public static void viewGuests(String [] guest) {
        Scanner console = new Scanner(System.in);

        int input;
        System.out.println("What room would you like to view?");
        input = console.nextInt();
        for (int i = 0; i < guest.length; i++) {
        //    int[] rangeGuest = Arrays.copyOfRange(guest, input - 5, input + 5);
                System.out.printf("Room #%s: %s%n", (i+1),  /*(rangeGuest[i]), */
                        guest[i] == null ? "unoccupied" : guest[i]);
            }
        }
    }





