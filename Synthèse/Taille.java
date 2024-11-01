class Taille
{
    public int octet;

    public Taille(int m)
    {
        this.octet = m;
    }

    public Taille(String chaine)
    {
        int val = Integer.valueOf(chaine.substring(0, chaine.length() - 2));
        String unite = chaine.substring(chaine.length() - 2);

        if(unite.equals("Ko"))
        {
            this.octet = val * 1000;
        }
        else if(unite.equals("Mo"))
        {
            this.octet = val * 1000 * 1000;
        }
        else
        {
            this.octet = val;
        }
    }

    public String toString()
    {
        return String.valueOf(this.octet);
    }

    public static void main(String[] args)
    {
        Taille t1 = new Taille(1440000);
        Taille t2 = new Taille("440Ko");
        Taille t3 = new Taille("20Mo");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }

}
