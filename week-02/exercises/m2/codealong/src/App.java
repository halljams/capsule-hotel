import java.util.Map;

public class App {
    public static void main(String[] args) {
        // 1. Instantiation
      /* Before Constructor
        NationalForest one = new NationalForest();
        // 2. set a 'public' field
        one.name = "Allegheny";
        one.location = "Pennsylvania";
        one.acres = 513655;

        NationalForest two = new NationalForest();
        two.name = "Angeles";

        NationalForest three = new NationalForest();
        three.name = "Angelina";

        Before Constructor
       */
        // Before additional constructors 'newcode1
       /* edited code 3
        NationalForest one = new NationalForest("Allegheny", "Pennsylvania", 513655);
        NationalForest two = new NationalForest("Angeles", "California", 661565);
        NationalForest three = new NationalForest("Angelina", "Texas", 154140);

        */

        /*Before additional constructors 'newcode1
        NationalForest one = new NationalForest("Allegheny", "Pennsylvania", 513655);
        NationalForest two = new NationalForest("Angeles", 661565);
        NationalForest three = new NationalForest("Angelina");
        NationalForest four = new NationalForest();
        */
        /* edited code 3
        //new code 2 results
        System.out.println(one.toLine());
        System.out.println(two.toLine());
        System.out.println(three.toLine());

         */
        /* new code 2
        String format = "name: %s, location: %s, acres: %s%n";
        // 3. Read each public field
        // each objects fields have different values
        System.out.printf(format, one.name, one.location, one.acres);
        System.out.printf(format, two.name, two.location, two.acres);
        System.out.printf(format, three.name, three.location, three.acres);

         */


        //new 4th output
       // System.out.printf(format, four.name, four.location, four.acres);
        //new code
        NationalForest one = new NationalForest("Dixie", "Utah", 123);

        //as individual fields and calcs
        System.out.println("Forest Name: " + one.getName());
        System.out.println("Location: " + one.getLocation());
        System.out.println("Acres: " + one.getAcres());
        System.out.println("Square km: " + one.getSquareKilometers());

        //all together
        System.out.println(one.toLine());

        //acres is wrong fix it
        one.setAcres(1885655);
        System.out.println("Fixed ----");
        System.out.println("Acres: " + one.getAcres());
        System.out.println("Square km: " + one.getSquareKilometers());
    }
}
