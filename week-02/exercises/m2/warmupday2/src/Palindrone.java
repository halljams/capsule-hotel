public class Palindrone {
    public static boolean checkPalindrone(String word) {
        word = word.toLowerCase();
        String characters = "";
        for (int i = 0 ; i < word.length(); i++) {
            if(Character.isLetter(word.charAt(i)) || Character.isDigit(i)) {
            characters += word.charAt(i);
        }
    }
    for (int i = 0, j = (characters.length() - 1); i <= j; i++, j--) {
        if (characters.charAt(i) != characters.charAt(j)) {
            return false;
        }
    }
    return true;
}
       /* checks the index not the char
       int front = word.indexOf(0);
        int back = word.indexOf(word.length() - 1);
        for (int i = 0; i < word.length(); i++) {
            if (front == back) ;
            {
                front++;
                back--;
                System.out.println("Is a palindrone.");
                return true;

            }
        }
        if (front != back) {
            System.out.println("Not a palindrone.");
            return false;
        }
        return false;
    }

        */

    public static void main(String[] args) {
        String level = "level";
        String radar = "radar";
        String kayak = "kayak";
        String not = "smell";

        checkPalindrone(level);
        checkPalindrone(radar);
        checkPalindrone(kayak);
        checkPalindrone(not);
    }
    }
