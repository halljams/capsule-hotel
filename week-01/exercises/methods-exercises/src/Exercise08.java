public class Exercise08 {
    public static String getRandomFruit() {

        switch ((int) (Math.random() * 5)) {
            case 0:
                return "Grape.";
            case 1:
                return "Watermelon";
            case 2:
                return "Apple";
            case 3:
                return "Peach";
            case 4:
                return "Cantaloupe";
        }
        return "";
    }

    // 1. Create a method.
    // Name: getRandomFruit
    // Inputs: none
    // Output: String
    // Description: returns a random fruit name as a string.
    // See Exercise01.
    // Choose from at least 5 fruit.

    public static void main(String[] args) {
        // 2. Call your method in various ways to test it here.
        String fruit = getRandomFruit();
        System.out.println(fruit);
    }
}
