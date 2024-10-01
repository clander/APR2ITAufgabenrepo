public class BruchEinfach {
     int zaehler;
     int nenner;

    public void ausgeben()
    {
        System.out.println("Bruch: " + this.zaehler + "/" + nenner);
    }

    void multiplizieren(BruchEinfach b)
    {
        zaehler = zaehler * b.zaehler;
        nenner = nenner + b.nenner;
       // b.nenner = 2; //Was passiert hier?
       // b.zaehler = 4;
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
        //zaehler *= zahl;
        nenner = nenner * zahl;
    }
}
