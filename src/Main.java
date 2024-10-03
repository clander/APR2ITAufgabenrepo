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
        var bruch3 = new Bruch();
        bruch3.zaehler = 10;
        bruch3.nenner = 5;
        //brucheinfach3.ausgeben();
        //brucheinfach3.kuerzen();
        //brucheinfach3.ausgeben();
        bruch3.gekuerztAusgeben();

        System.out.println("***** Bruch 4 - Multiplikation ******");
        Bruch bruch4 = new Bruch();
        bruch4.zaehler = 5;
        bruch4.nenner = 6;
        System.out.println("Bruch 4 vor Multiplikation:");
        bruch4.ausgeben();
        Bruch bruch5 = new Bruch();
        bruch5.zaehler = 3;
        bruch5.nenner = 4;
        System.out.println("Bruch 5 vor Multiplikation:");
        bruch5.ausgeben();
        bruch5.multiplizieren(bruch4);
        System.out.println("Bruch 4 nach Multiplikation:");
        bruch4.ausgeben();
        System.out.println("Bruch 5 nach Multiplikation:");
        bruch5.ausgeben();

        System.out.println("**** Überladen testen *****");
        bruch5.ausgeben();
        bruch5.setze(5); //überladene Methode
        bruch5.ausgeben(); //erwartet: 5/1
        bruch5.setze(5,4); //überladene Methode
        bruch5.ausgeben(); //erwartet: 5/4

        System.out.println("**** Dezimalwert-Methode testen *****");
        bruch5.setze(3,4);
        bruch5.ausgeben();
        double d = bruch5.dezimalwert(); // erwartet: 0,75
        System.out.println("Dezimalwert: " + d);

        System.out.println("***** Signum-Methode testen *****");
        bruch5.setze(5,4);
        bruch5.ausgeben();
        System.out.println("Signum: " + bruch5.signum()); //erwartet:1
        bruch5.setze(-5,4);
        bruch5.ausgeben();
        System.out.println("Signum: " + bruch5.signum()); //erwartet:-1
        bruch5.setze(0,4);
        bruch5.ausgeben();
        System.out.println("Signum: " + bruch5.signum()); //erwartet:0

        System.out.println("**** Konstruktoren *****");
        Bruch bruch6 = new Bruch();
        bruch6.ausgeben(); //erwartet 0/1
        Bruch bruch7 = new Bruch(5,6);
        bruch7.ausgeben();//erwatet 5/6
    }
}