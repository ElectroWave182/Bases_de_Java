import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

class Abonne
{

    public String prenom, nom;
    public int num = 1;

    public Abonne(String p, String n)
    {
        this.prenom = p;
        this.nom = n;
        this.num++;
    }

    public String toString(Abonne a)
    {
        return "(" + a.num + ") " + a.prenom + " " + a.nom;
    }

    public int (Abonne x).compareTo(Abonne y)
    {
        int dist = (x.nom).compareTo(y.nom);
        if(dist == 0)
        {
            return (x.prenom).compareTo(y.prenom);
        }
        return dist;
    }

    public static void main(String[] args)
    {
        ArrayList<Abonne> liste = new ArrayList<>(Arrays.asList(Abonne("Florian", "Guibert"), Arrays.asList(Abonne("Idriss", "Berkane"), Arrays.asList(Abonne("Elsa", "Verinski"), Arrays.asList(Abonne("Anne", "Guibert")));

        Collections.sort(liste);
        System.out.print(liste);
    }

}
