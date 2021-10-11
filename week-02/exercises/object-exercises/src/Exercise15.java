public class Exercise15 {

    // 1. Create a new method in the Hero class.
    // Name: toLine
    // Inputs: none
    // Output: String
    // Description: returns the Hero's name and powers as a single line of text.

    public static void main(String[] args) {
        Power superior = new Power("Strength + Flight");
        Power speed = new Power("Very Fast");
        Power transform = new Power("Transformation");


        Hero superman =  new Hero("Superman", new Power[]{superior});
        Hero flash = new Hero("FLash", new Power[]{speed});
        Hero beastman =  new Hero("Beastman", new Power[]{transform});

        System.out.println(beastman.toLine());
        System.out.println(superman.toLine());
        System.out.println(flash.toLine());

        // 2. Instantiate your three favorite super heroes with appropriate powers.
        // 3. Use the `toLine` method to print each hero's details to the console.
    }
}
