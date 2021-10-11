import java.awt.*;
import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
   /*     Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.println("Enter a value: ");
            result = console.nextLine();
            System.out.println("You have entered: " + result);
        } while (!result.equals("exit"));
    }

    */
        /*
        Scanner one = new Scanner("one\ntwo\nthree\nfour");
        Scanner two = new Scanner("red\nyellow\nblue\ngreen");

        String result;

        while (one.hasNext()) {
            result = one.next();
            System.out.println(result);
        }
        while (two.hasNext()) {
            result = two.next();
            System.out.println(result);
        }

         */
        /*
        Scanner one = new Scanner(("one!tow!three!four"));
        Scanner two = new Scanner(("one!tow!three!four"));
        two.useDelimiter("!");

        String result;

        System.out.println("one's delimiter: " + one.delimiter());
        while (one.hasNext()) {
            result = one.next();
            System.out.println(result);
        }

        System.out.println("two's delimiter: " + two.delimiter());
        while (two.hasNext()){
            result = two.next();
            System.out.println(result);

         */
        //success is an instance of color
        Color success = new Color("green");

        //failure is an instance of color
        Color failure = new Color("blue");

        //warning is an instance of color
        Color warning = new Color("yellow");

        //each color has its own state
        //the dot operator '.' looks inside the object
        System.out.println("Success color is " + success.name);
        System.out.println("Failure color is: " + failure.name);
        System.out.println("Warning color is: " + warning.name);

        //the failure color doesnt seem right
        //change is to red
        failure.name = "red";
        System.out.println("Failure color is: " + failure.name);

        }
    }
    /*
    The template, blueprint, or recipe for a Color.
    It isnt a color but it contains teh rules which define what it means to be a
    color.
     */
    class Color {
    public String name;
    public Color(String name) {
        this.name = name;
    }
}
