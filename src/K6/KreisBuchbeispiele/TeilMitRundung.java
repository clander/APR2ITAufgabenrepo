package K6.KreisBuchbeispiele;

public class TeilMitRundung {

    double radius;
    TeilMitRundung()
    {
        radius = 1;
    }
    TeilMitRundung(double r)
    {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    void radiusVergroessernUm(double vr)
    {
        radius = radius + vr;
    }
}
