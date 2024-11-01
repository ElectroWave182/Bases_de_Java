class Horaire
{

    public int heure, minute;

    public Horaire(int h, int m)
    {
        this.heure = h % 24 + m / 60;
        this.minute = m % 60;
    }

    public String toString()
    {
        return this.heure + "h" + this.minute;
    }

    public (int, int) avancer(int h, int m)
    {
        return // ?
    }

    public static void main(String[] args)
    {
        Hoiraire h1 = new Horaire(9, 15);
        Hoiraire h2 = new Horaire(10, 0);
        Hoiraire h3 = new Horaire(22, 30);
        Hoiraire h4 = new Horaire(12, 15);
    }

}
