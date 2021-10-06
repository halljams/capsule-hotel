import java.util.Scanner;

public class Exercise10 {

    public static void main(String[] args) {
        // USPS
        // Below is an abbreviated version of the US Postal Service retail parcel rates:
        /*
        Lbs | Zones 1&2 | Zone 3
        ===============
        1      $7.50      $7.85
        2       8.25       8.70
        3       8.70       9.70
        4       9.20      10.55
        5      10.20      11.30
        */

        // 1. Collect the parcel lbs and zone (1, 2, or 3) from the user.
        // 2. Add `if`/`else if`/`else` logic to cover all rates.
        // Use whatever strategy you think is best. You can create compound conditions or nest if/else statements.
        // If a lbs/zone combo does not exist, print a warning message for the user.

        Scanner console = new Scanner(System.in);
        System.out.println("How many pounds is your package?:  ");
        int lbs = console.nextInt();
        System.out.println("In which zone do you reside (respond with numbers 1, 2, or 3) ?: ");
        int zone = console.nextInt();

        if (lbs == 1) {
            if (zone == 3) {
            System.out.println("Your price is $7.85");
        } else if (zone == 2 || zone ==1) {
                System.out.println("Your price is $7.50");
            } else
                System.out.println("Warning This combo does not exist!");
    }
        if (lbs == 2) {
            if (zone == 3) {
                System.out.println("Your price is $8.70");
            } else if (zone == 2 || zone ==1) {
                System.out.println("Your price is $8.25");
            } else
                System.out.println("Warning This combo does not exist!");
        }
        if (lbs == 3) {
            if (zone == 3) {
                System.out.println("Your price is $9.70");
            } else if (zone == 2 || zone ==1) {
                System.out.println("Your price is $8.70");
            } else
                System.out.println("Warning This combo does not exist!");
        }
        if (lbs == 4) {
            if (zone == 3) {
                System.out.println("Your price is $10.55");
            } else if (zone == 2 || zone ==1) {
                System.out.println("Your price is $9.20");
            } else
                System.out.println("Warning This combo does not exist!");
        }
        if (lbs == 5) {
            if (zone == 3) {
                System.out.println("Your price is $11.30");
            } else if (zone == 2 || zone ==1) {
                System.out.println("Your price is $10.20");
            } else
                System.out.println("Warning This combo does not exist!");
        }
}
}
