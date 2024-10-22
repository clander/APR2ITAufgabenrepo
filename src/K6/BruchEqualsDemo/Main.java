package K6.BruchEqualsDemo;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** Bruch-Equals-Demo *** ");
        Bruch b1 = new Bruch(3,4);
        Bruch b2 = new Bruch(3,4);
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b1));
        System.out.println(b1==b2);
        System.out.println(b2==b1);
    }
}
