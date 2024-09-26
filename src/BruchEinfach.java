public class BruchEinfach {
    int zaehler;
    int nenner;

    void ausgeben()
    {
        System.out.println("Bruch: " + this.zaehler + "/" + nenner);
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
}
