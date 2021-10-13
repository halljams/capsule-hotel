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
                guestcheckIn(roomNumbers);
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

    public static void guestcheckIn(String[] hotel) {
        Scanner con = new Scanner(System.in);
        String guestName;
        int roomNumber;
        do {
            System.out.println("Enter Guest Name: ");
            guestName = con.nextLine();
            if (guestName.isBlank()) {
                System.out.println("Error: Cannot be blank");
            }
        } while (guestName.isBlank());

        do {
            System.out.print("Choose a room: ");
            roomNumber = parseInt(con.nextLine()) - 1;
            if ((roomNumber < 0) || roomNumber > hotel.length) {
                System.out.print("That room number is not in range.");
            }
            if (!hotel[roomNumber].equals("unoccupied")) {
                System.out.println("That room is taken. Pick another.");
            } else
            hotel[roomNumber] = guestName;
        } while (hotel[roomNumber].equals("unoccupied"));

        hotel[roomNumber] = guestName;

        System.out.println("Guest name: " + guestName + " Room#: " + roomNumber);
    }

    public static void guestCheckOut(String[] hotel) {
        Scanner console = new Scanner(System.in);
        int roomNumber;

        do {
            System.out.print("What room would you like to check out of: ");
            roomNumber = (parseInt(console.nextLine()) - 1);
            if ((roomNumber < 0) || roomNumber > hotel.length) {
                System.out.print("That room number is not in range.");
                if (hotel[roomNumber].equals("unoccupied")) {
                    System.out.println("That room is vacant. Please choose your room.");
                }
            } hotel[roomNumber] = "unoccupied";
        } while (!hotel[roomNumber].equals("unoccupied"));

        System.out.print("You have signed out of your room.");
    }


    public static void viewGuests(String[] guest) {
        Scanner console = new Scanner(System.in);

        int input;
        System.out.println("What room would you like to view?");
        input = console.nextInt() - 1;
        for (int i = input - 5; i <= input + 5; i++) {
            if ((i >= 0) && (i <= guest.length)) {
                System.out.printf("Room #%s: %s%n", (i + 1),
                        guest[i] == null ? "unoccupied" : guest[i]);
            }
        }
    }
}







