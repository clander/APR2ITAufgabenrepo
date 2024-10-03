public class Main {
    public static void main(String[] args) {

        System.out.println("***** Bruch 1 ******");
        Bruch bruch = new Bruch();
        bruch.zaehler = 24;
        bruch.nenner = 0;
        bruch.ausgeben();

        System.out.println("***** Bruch 2 ******");
        Bruch bruch2 = new Bruch();
        bruch2.zaehler = 4;
        bruch2.nenner = 3;
        bruch2.ausgeben();
        bruch2.nenner = 22;
        bruch2.ausgeben();
        bruch2.kuerzen();
        bruch2.ausgeben();
        bruch2.erweitern(3);
        bruch2.ausgeben();
        bruch2.kuerzen();
        bruch2.ausgeben();

        System.out.println("***** Bruch 3 ******");
        var brucheinfach3 = new Bruch();
        brucheinfach3.zaehler = 10;
        brucheinfach3.nenner = 5;
        //brucheinfach3.ausgeben();
        //brucheinfach3.kuerzen();
        //brucheinfach3.ausgeben();
        brucheinfach3.gekuerztAusgeben();

        System.out.println("***** Bruch 4 - Multiplikation ******");
        Bruch bruch4 = new Bruch();
        bruch4.zaehler = 5;
        bruch4.nenner = 6;
        System.out.println("Bruch 4 vor Multiplikation:");
        bruch4.ausgeben();
        Bruch bruchEinfach5 = new Bruch();
        bruchEinfach5.zaehler = 3;
        bruchEinfach5.nenner = 4;
        System.out.println("Bruch 5 vor Multiplikation:");
        bruchEinfach5.ausgeben();
        bruchEinfach5.multiplizieren(bruch4);
        System.out.println("Bruch 4 nach Multiplikation:");
        bruch4.ausgeben();
        System.out.println("Bruch 5 nach Multiplikation:");
        bruchEinfach5.ausgeben();

        System.out.println("**** Überladen testen *****");
        bruchEinfach5.ausgeben();
        bruchEinfach5.setze(5); //überladene Methode
        bruchEinfach5.ausgeben(); //erwartet: 5/1
        bruchEinfach5.setze(5,4); //überladene Methode
        bruchEinfach5.ausgeben(); //erwartet: 5/4
    }
}