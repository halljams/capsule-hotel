public class Exercise06 {
    public static boolean isBetween(int a, int b, int c) {
        boolean num = (b < a && a <c);
        return num;


    }

    // 1. Create a method.
    // Name: isBetween
    // Inputs: int, int, int
    // Output: boolean
    // Description: return true if the first parameter is between the second and third parameter.
    // Otherwise, returns false.

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        System.out.println(isBetween(5,4,10)); //true
        System.out.println(isBetween(10,15,25)); //false
        System.out.println(isBetween(25,10,15)); //false
    }
}
