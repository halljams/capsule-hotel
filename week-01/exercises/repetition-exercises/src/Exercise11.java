import java.util.Scanner;
public class Exercise11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter you starting number: ");
        int start = Integer.parseInt(console.nextLine());

        System.out.println("Enter your end number: ");
        int end = Integer.parseInt(console.nextLine());

        System.out.println("Enter you incremental number: ");
        int inc = Integer.parseInt(console.nextLine());
        int sum = 0;

        do {
            start += inc;
            sum += (start - 1);
        }
            while (start < end) ;{
            }
                System.out.println("Sum values: " +sum);
            }
        }

