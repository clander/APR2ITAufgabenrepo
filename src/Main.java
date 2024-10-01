public class Main {
    public static void main(String[] args) {

        System.out.println("***** Bruch 1 ******");
        BruchEinfach bruchEinfach = new BruchEinfach();
        bruchEinfach.zaehler = 24;
        bruchEinfach.nenner = 0;
        bruchEinfach.ausgeben();

        System.out.println("***** Bruch 2 ******");
        BruchEinfach bruchEinfach2 = new BruchEinfach();
        bruchEinfach2.zaehler = 4;
        bruchEinfach2.nenner = 3;
        bruchEinfach2.ausgeben();
        bruchEinfach2.nenner = 22;
        bruchEinfach2.ausgeben();
        bruchEinfach2.kuerzen();
        bruchEinfach2.ausgeben();
        bruchEinfach2.erweitern(3);
        bruchEinfach2.ausgeben();
        bruchEinfach2.kuerzen();
        bruchEinfach2.ausgeben();

        System.out.println("***** Bruch 3 ******");
        var brucheinfach3 = new BruchEinfach();
        brucheinfach3.zaehler = 10;
        brucheinfach3.nenner = 5;
        //brucheinfach3.ausgeben();
        //brucheinfach3.kuerzen();
        //brucheinfach3.ausgeben();
        brucheinfach3.gekuerztAusgeben();

        System.out.println("***** Bruch 4 - Multiplikation ******");
        BruchEinfach bruchEinfach4 = new BruchEinfach();
        bruchEinfach4.zaehler = 5;
        bruchEinfach4.nenner = 6;
        System.out.println("Bruch 4 vor Multiplikation:");
        bruchEinfach4.ausgeben();
        BruchEinfach bruchEinfach5 = new BruchEinfach();
        bruchEinfach5.zaehler = 3;
        bruchEinfach5.zaehler = 4;
        System.out.println("Bruch 5 vor Multiplikation:");
        bruchEinfach5.ausgeben();
        bruchEinfach5.multiplizieren(bruchEinfach4);
        System.out.println("Bruch 4 nach Multiplikation:");
        bruchEinfach4.ausgeben();
        System.out.println("Bruch 5 nach Multiplikation:");
        bruchEinfach5.ausgeben();
    }
}