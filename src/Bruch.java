public class Bruch {
     int zaehler;
     int nenner;

    public void ausgeben()
    {
        System.out.println("Bruch: " + this.zaehler + "/" + nenner);
    }

    void multiplizieren(Bruch b)
    {
        zaehler = zaehler * b.zaehler;
        nenner = nenner + b.nenner;
       // b.nenner = 2; //Was passiert hier?
       // b.zaehler = 4;
    }

    void setze(int zaehler)
    {
        this.zaehler = zaehler;
        this.nenner = 1;
    }

    void setze(int zaehler, int nenner)
    {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    void gekuerztAusgeben()
    {
        kuerzen();
        ausgeben();
    }
    void kuerzen()
    {
        var m = Math.abs(zaehler);
        var n = Math.abs(nenner);
        var r = m % n;
        while(r>0)
        {
            m = n;
            n = r;
            r = m % n;
        }
        zaehler = zaehler / n;
        nenner = nenner / n;
    }

    void erweitern(int zahl)
    {
        zaehler = zaehler * zahl;
        nenner = nenner * zahl;
    }

    double dezimalwert()
    {
        return this.zaehler/this.nenner;
    }
}
