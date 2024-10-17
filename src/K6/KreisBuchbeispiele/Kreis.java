package K6.KreisBuchbeispiele;

public class Kreis extends TeilMitRundung {

    Kreis(double r)
    {
        super(r);//Aufruf des Mutterklassenkonstruktors
    }

    double getUmfang()
    {
        return 2 * Math.PI*this.getRadius();
    }

    double getFlaeche()
    {
        return Math.PI*this.getRadius()*this.getRadius();
    }
}
