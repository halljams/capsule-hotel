import java.io.PrintStream;

public class Hero {
    String name;
    Power[] powers;

    public String getName() {
        return this.name;
    }
    public Power[] getPowers() {
        return this.powers;
    }

    public Hero(String name, Power[] powers) {
        this.name = name;
        this.powers = powers;
    }
public String toLine() {
      return String.format("Hero's name: %s%nHeroes Powers: %s%n", name, powers);

}


}
