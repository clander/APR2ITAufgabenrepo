package K9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte kg eingeben!");
            double kg = Double.parseDouble(scanner.nextLine());
            System.out.println("Bitte Größe in m eingeben!");
            double m = Double.parseDouble(scanner.nextLine());
            System.out.println("BMI:");
            double bmi = kg / (m*m);
            System.out.println(bmi);
        }
        catch(NumberFormatException nfex)
        {
            System.out.println("BMI konnte nicht berechnet werden. Fahlscheingabe!");
            System.out.println(nfex.getMessage());
        }
        catch(NullPointerException npex)
        {
            System.out.println("BMI konnte nicht berechnet werden. Nulleingabe!");
            System.out.println(npex.getMessage());
        } finally {
            System.out.println("BMI-Programm beendet!");
        }
    }
}
