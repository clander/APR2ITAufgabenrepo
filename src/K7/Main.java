package K7;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        String s1 = "a";
        String s2 = "b";
        String s3 = "c";
        String s4 = "B";

        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println((int)s2.charAt(0));
        System.out.println((int)s4.charAt(0));


        System.out.println("Das ist ein String".charAt(4));
        String s5 = "Das ist ein netter String";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());

        int i1 = 23;
        System.out.println(String.valueOf(i1)+5);
        System.out.println(i1+5);
        System.out.println(i1+""+5);

        //String Builder
        StringBuilder sb = new StringBuilder("Hallo Welt");
        sb.append("23");
        System.out.println(sb);
        sb.insert(4,"Neu");
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);
        String ergebnis = sb.toString();
        System.out.println(ergebnis);

        //Substring
        String sub = "Hallo Welt";
        System.out.println(sub.substring(5));
        System.out.println(sub.substring(5, 7));

        //Wrapper-Klassen
        Integer i2 = Integer.valueOf(1);
        System.out.println(i2);
        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben: ");
        String benutzerEingabe = scan.nextLine();
        int eingabeZahl = Integer.parseInt(benutzerEingabe);
        int eingabeZahl2 = Integer.valueOf(benutzerEingabe);//Autounboxing
        int eingabeZahl3 = i2; //Autounboxing
        Integer i3 = 2; //Autoboxing;
        int i4 = i3.intValue();

        //Zeit
        long t1 = System.currentTimeMillis();
        //Thread.sleep(2000);
        int c1 = 0;
        while(c1 < 100000000)
        {
            c1++;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("Zeit 1: " + t1);
        System.out.println("Zeit 2: " + t2);
        System.out.println("Differenz im ms: " + (t2-t1));

        Instant inst1 = Instant.EPOCH;
        System.out.println(inst1);
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
        System.out.println(Instant.now());
        Instant inst2 = Instant.parse("2024-11-14T11:12:41.778654Z");
        System.out.println(inst2);
        System.out.println(inst2.plus(1, ChronoUnit.HOURS));



    }
}
