public class Main {
    public static void main(String[] args) {

        BruchEinfach bruchEinfach = new BruchEinfach();
        bruchEinfach.zaehler = 24;
        bruchEinfach.nenner = 0;
        bruchEinfach.ausgeben();


        System.out.println("Hello world!");
        System.out.println("Hello world!");
        Bruch bruch = new Bruch(2,4);
        Bruch bruch2 = new Bruch(6,4);

        bruch.setNenner(5);
        bruch.setZaehler(6);
        int nenner = bruch.getNenner();
        System.out.println("Der Nenner: " +  nenner);
        System.out.println("Der Nenner des 2. Bruchs: " + bruch2.getNenner());
    }
}