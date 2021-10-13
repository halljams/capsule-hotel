import java.util.Random;
public class Treasure {
    private final char symbol;
    private  int t;
    private  int g;
    Random rand = new Random();

    public Treasure(char symbol, int  t, int g) {
        this.symbol = symbol;
        this.t = t;
        this.g = g;
    }


    public int getT() {
        return t;
    }

    public int getG() {
        return g;
    }

    public char getSymbol() {
        return symbol;
    }
}


