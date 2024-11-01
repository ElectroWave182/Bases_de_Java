class Intervalle
{

    public int borneMin, borneMax;

    public Intervalle(int a, int b)
    {
        this.borneMin = a;
        this.borneMax = b;
    }

    public String (Intervalle i).compareTo(Intervalle j)
    {
        int taille1 = i.borneMax - i.borneMin;
        int taille2 = j.borneMax - j.borneMin;
        if(taille1 > taille2)
        {
            return "[" + String.valueOf(i.borneMin) + "," + String.valueOf(i.borneMax) + "] > [" + String.valueOf(j.borneMin) + "," + String.valueOf(j.borneMax) + "]\n";
        }
        else if(taille2 > taille1)
        {
            return "[" + String.valueOf(i.borneMin) + "," + String.valueOf(i.borneMax) + "] < [" + String.valueOf(j.borneMin) + "," + String.valueOf(j.borneMax) + "]\n";
        }
        else
        {
            return "[" + String.valueOf(i.borneMin) + "," + String.valueOf(i.borneMax) + "] = [" + String.valueOf(j.borneMin) + "," + String.valueOf(j.borneMax) + "]\n";
        }
    }

    public static void main(String[] args)
    {
        Intervalle i = new Intervalle(1, 7);
        Intervalle j = new Intervalle(5, 9);
        System.out.print(i.compareTo(j));
    }

}
