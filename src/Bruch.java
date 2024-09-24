public class Bruch {
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void setZaehler(int zaehler)
    {
        if(zaehler>=0)
        {
            this.zaehler = zaehler;
        }

    }
    public void setNenner(int nenner)
    {
        if(nenner > 0)
        {
            this.nenner = nenner;
        }
    }

    public int getNenner()
    {
        return this.nenner;
    }

}
