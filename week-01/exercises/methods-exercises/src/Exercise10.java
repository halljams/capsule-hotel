public class Exercise10 {
    public static String removeWhite(String white) {
        String remove = white.replace(" ", "");
        return remove;
    }
    // 1. Add a `main` method.
    // 2. Create method that accepts a String and returns that string with all of its whitespace remove.
    // 2. Call your method in various ways in the main method.
    public static void main(String[] args) {
        System.out.println(removeWhite("Where am I going?"));
        System.out.println(removeWhite("Wow           that is a lot of white space."));
    }
}
