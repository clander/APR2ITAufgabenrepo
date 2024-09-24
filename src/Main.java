public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        Bruch bruch = new Bruch(2,4);
        bruch.setNenner(5);
        bruch.setZaehler(6);
        int nenner = bruch.getNenner();
        System.out.println("Der Nenner: " +  nenner);
    }
}