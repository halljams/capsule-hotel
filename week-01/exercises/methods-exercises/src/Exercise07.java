public class Exercise07 {
    public static boolean areInOrder(int a, int b, int c, int d) {
        boolean order = (a < b && b < c && c < d);
        return order;
    }
    // 1. Create a method.
    // Name: areInOrder
    // Inputs: int, int, int, int
    // Output: boolean
    // Description: return true if the four parameters are in ascending order.
    // Otherwise, returns false.

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        System.out.println(areInOrder(1, 2, 3, 4)); //true
        System.out.println(areInOrder(2,1,3,4)); //false

    }
}
