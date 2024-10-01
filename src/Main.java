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

        System.out.println("***** Bruch 3 ******");
        var brucheinfach3 = new BruchEinfach();
        brucheinfach3.zaehler = 10;
        brucheinfach3.nenner = 5;
        //brucheinfach3.ausgeben();
        //brucheinfach3.kuerzen();
        //brucheinfach3.ausgeben();
        brucheinfach3.gekuerztAusgeben();
        
    }
}