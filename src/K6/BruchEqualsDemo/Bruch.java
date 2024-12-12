package K6.BruchEqualsDemo;

public class Bruch {
     int zaehler;
     int nenner;

     Bruch()
     {
         zaehler = 0;
         nenner = 1;
     }

     Bruch(int zaehler, int nenner)
     {
         this.zaehler = zaehler;
         this.nenner = nenner;
     }

    public void ausgeben()
    {
        System.out.println("K5.Bruch: " + this.zaehler + "/" + nenner);
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

    int signum()
    {
        if(dezimalwert()>0)
        {
            return 1; // corrected the condition to account for zero
        } else if(dezimalwert()<0)
        {
            return -1;
        } else
        {
            return 0;
        }
    }

    double dezimalwert()
    {
        return (double)this.zaehler/(double)this.nenner;//jetzt Division mit Komma (Gleitkomma-Division)
    }

    boolean equals(Bruch bruchZumVergleich)
    {
        if(bruchZumVergleich==null || bruchZumVergleich.getClass()!=this.getClass())
        {
            return false;
        } else
        {
            return this.zaehler == bruchZumVergleich.zaehler && this.nenner == bruchZumVergleich.nenner;
        }
    }
}
