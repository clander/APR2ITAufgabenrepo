package K6;

public class Dreieck {
    Punkt p1; //Teile-Ganzes-Beziehung
    Punkt p2; //Teile-Ganzes-Beziehung
    Punkt p3; //Teile-Ganzes-Beziehung

    Farbe farbe;

    public Dreieck(int x1, int y1, int x2, int y2, int x3, int y3, Farbe farbe) {
        this.p1 = new Punkt(x1, y1);
        this.p2 = new Punkt(x2, y2);
        this.p3 = new Punkt(x3, y3);
        this.farbe = farbe;
    }

    public Dreieck(Punkt newP1, Punkt newP2, Punkt newP3, Farbe farbe) {
        this.p1 = newP1;
        this.p2 = newP2;
        this.p3 = newP3;
        this.farbe = farbe;
    }

    public Punkt getPunkt1() {
        return this.p1;
    }

    public Punkt getPunkt2() {
        return this.p2;
    }

    public Punkt getPunkt3() {
        return this.p3;
    }

    public Farbe getFarbe() {
        return this.farbe;
    }

    public void setP1(Punkt newPunkt) {
        this.p1 = newPunkt;
    }

    public void setP2(Punkt newPunkt) {
        this.p2 = newPunkt;
    }

    public void setP3(Punkt newPunkt) {
        this.p3 = newPunkt;
    }

    public void setFarbe(Farbe farbeNeu) {
        this.farbe = farbeNeu;
    }

    public int xVonPunkt1() {
        return p1.getX();//Delegation
    }

}
