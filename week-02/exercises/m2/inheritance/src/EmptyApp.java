public class EmptyApp {
    public static void main(String[] args) {
        Empty nothing = new Empty();
        System.out.println(nothing.toString());
        System.out.println(nothing.hashCode());
        System.out.println(nothing.getClass().getName());
        System.out.println(nothing.equals(null));
    }

}
