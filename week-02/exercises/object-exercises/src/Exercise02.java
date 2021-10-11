public class Exercise02 {

    public static void main(String[] args) {

        // 1. Add a getter for the rating field in Musician.

        Musician ocean = new Musician("Frank Ocean", 10);
        System.out.println(ocean.getName());
        // 2. Uncomment the line below and insure that it compiles and runs.
         System.out.println(ocean.getRating());
        Musician bono = new Musician("Bono", 7);
        Musician gnarles = new Musician("Gnarles Barkley", 9);

        System.out.printf("Name: %s%n Rating: %s%n", bono.getName(), bono.getRating());
        System.out.printf("Name: %s%n Rating: %s%n", gnarles.getName(), gnarles.getRating());
        // 3. Instantiate two musicians and assign them to new variables.
        // 4. Print each musicians' name and rating on a single line.
    }
}
