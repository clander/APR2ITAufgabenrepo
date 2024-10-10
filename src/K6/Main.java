package K6;

public class Main {

    public static void main(String[] args) {

        Dreieck d1 = new Dreieck(12,3,45,3,64,3);
        Dreieck d2 = new Dreieck(
                new Punkt(44,3),
                new Punkt(4,3),
                new Punkt(6,3)
        );

        System.out.println(d1.xVonPunkt1());//erwartet: 12
        System.out.println(d2.xVonPunkt1());//erwartet 44


        d1.setP1(new Punkt(78,55));
        System.out.println(d1.xVonPunkt1());//erwartet: 78


    }
}
