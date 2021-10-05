public class Exercise25 {
    public static void main(String[] args) {
        String noun1 = "car";
        String noun2 = "school";
        String verb1 = "run";
        String verb2 = "grab";
        String adjective1 = "smelly";
        String adjective2 = "boisterous";

        String MadLib = "There once was a " + adjective2 + " " + noun1 + " who could not " + verb1 +
                ". " + " However, there was a " + noun2 + " that could " + verb1 +
                 " but chose to be " + adjective1 + " and " + verb2 + " instead.";

        System.out.println(MadLib);
    }

    // Mad Libs: https://en.wikipedia.org/wiki/Mad_Libs
    // 1. Add a main method.
    // 2. Declare several variables of various types to be "plugged in" to a Mad Libs sentence.
    // 3. Use string concatenation to build a silly sentence.
    // 4. Print the result.
    // 5. Change variable values to change the sentence. Ask a friend for random values to increase the chances
    // of something hilarious or kinda naughty.
}
