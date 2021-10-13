import java.io.PrintStream;

public class Hero {
    private String name;
    private Power[] powers;

    public String getName() {
        return name;
    }
    public Power[] getPowers() {
        return powers;
    }

    public Hero(String name, Power[] powers) {
        this.name = name;
        this.powers = powers;
    }
public String toLine() {
      String result = "";
      result += name + "; ";
      for (Power p : powers) {
          result += p.getName() + ",";
      }

   //    return String.format("Hero's name: %s%nHeroes Powers: %s%n", name, powers);
 return result;
}


}
