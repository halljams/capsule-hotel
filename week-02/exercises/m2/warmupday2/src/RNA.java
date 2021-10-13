import java.util.Scanner;

public class RNA {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Input RNA sequence: ");
        String rna = console.nextLine();
        RNA r = new RNA();
        System.out.println(rna + " ---> " + r.pairSequence(rna));
    }
    public String pairSequence(String x) {
        String result = "";
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            switch (c) {
                case 'A':
                    result += "U";
                    break;
                case 'U':
                    result += "A";
                    break;
                case 'G':
                    result += "C";
                    break;
                case 'C':
                    result += "G";
                    break;
            }
        }
        return result;


    }
}
