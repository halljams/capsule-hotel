import java.util.Scanner;

public class Exercise17 {

    public static void main(String[] args) {
        // SWITCH HOMEWORK
        Scanner console = new Scanner(System.in);

        System.out.print("Hours of homework: ");
        int hoursOfHomework = Integer.parseInt(console.nextLine());

        System.out.println("1. Is Monday");
        System.out.println("2. Is Tuesday");
        System.out.println("3. Is Wednesday");
        System.out.println("4. Is Thursday");
        System.out.println("5. Is Friday");
        System.out.println("6. Is Saturday");
        System.out.println("7. Is Sunday");
        System.out.println("Day of the week [1-7]: ");
        boolean yesHomework = false;
        int dayOfWeek = Integer.parseInt(console.nextLine());

       switch (dayOfWeek) {
           case 1:
               yesHomework = true;
               break;
           case 2:
               yesHomework = true;
               break;
           case 3:
               yesHomework = true;
               break;
           case 4:
               yesHomework = true;
               break;
           case 5:
               yesHomework = true;
               break;
           case 6:
               if (hoursOfHomework < 15) {
                   System.out.println("Abdi skips his homework");
               } else {
                   yesHomework = true;
               }
               break;
           case 7:
               if (hoursOfHomework < 15) {
               System.out.println("Abdi skips his homework");
                } else {
                    yesHomework = true;
                }
                 break;
           default:
               System.out.println("Pick a day in range.");



       }
       if (yesHomework == true) {
           System.out.println("Abdi does his homework");
       }

        // 1. Re-implement Exercise07 using a switch statement.
        // Days 6 and 7 represent Saturday and Sunday.
        // If it's the weekend and Abdi has less than 15 hours of homework, he skips homework for the day.
        // For all other days, or if he has more than 15 hours of homework, he does his homework.
        // ---
        // You may choose to track data -- maybe a boolean for homework yes/no -- instead of printing a message in
        // each case. That's a lot of repeated typing.
        // Then print the detailed message after the switch.
    }
}
