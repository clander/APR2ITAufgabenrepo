public class Main {
    public static void main(String[] args) {

        BruchEinfach bruchEinfach = new BruchEinfach();
        bruchEinfach.zaehler = 24;
        bruchEinfach.nenner = 0;
        bruchEinfach.ausgeben();

        BruchEinfach bruchEinfach2 = new BruchEinfach();
        bruchEinfach2.zaehler = 4;
        bruchEinfach2.nenner = 3;
        bruchEinfach2.ausgeben();
        bruchEinfach2.nenner = 22;
        bruchEinfach2.ausgeben();

        var brucheinfach3 = new BruchEinfach();
        brucheinfach3.zaehler = 4;
        brucheinfach3.zaehler = 6;
        brucheinfach3.ausgeben();

    }
}