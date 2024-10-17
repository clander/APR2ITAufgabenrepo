package K6.KreisBuchbeispiele;

public class Main {

    public static void main(String[] args) {
        TeilMitRundung teilMitRundungDefault = new TeilMitRundung();
        System.out.println(teilMitRundungDefault.getRadius());//erwartet 1
        TeilMitRundung teilMitRundung = new TeilMitRundung(4);
        System.out.println(teilMitRundung.getRadius());//erwartet 4
        teilMitRundung.radiusVergroessernUm(4);
        System.out.println(teilMitRundung.getRadius());//erwartet 8
    }
}
