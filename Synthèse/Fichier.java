import java.util.ArrayList;
import java.util.Arrays;

class Fichier
{

    // Entrée
    public String nom;
    public String ext;
    public int taille;

    // Sortie
    public String fich;
    public ArrayList<String> fichiers = new ArrayList<>();

    public Fichier(String n, String e, double t)
    {
        String unite;
        if(taille > 1000.0 * 1000.0 * 1000.0)
        {
            unite = "Go";
            taille /= 1000 * 1000 * 1000;
        }
        else if(taille > 1000.0 * 1000.0)
        {
            unite = "Mo";
            taille /= 1000 * 1000;
        }
        else if(taille > 1000.0)
        {
            unite = "Ko";
            taille /= 1000;
        }
        else
        {
            unite = " octets";
        }
        String details = n + "." + e + " (" + String.valueOf(taille) + unite + ")";
        this.fich = details;
        this.fichiers.add(details);
    }

    public String toString()
    {
        String sortie = "[";
        for(String f: this.fichiers)
        {
            sortie += f + ", ";
        }
        return sortie;
    }

    public static void main(String[] args)
    {
        Fichier f1 = new Fichier("data", "csv", 1440000.0);
        Fichier f2 = new Fichier("readme", "txt", 4056.0);
        Fichier f3 = new Fichier("cookie", "txt", 24.0);
        Fichier f4 = new Fichier("data", "exe", 55480000.0);
        Fichier f5 = new Fichier("resultats", "csv", 120000.0);

        //ArrayList<String> liste = new ArrayList<>(Arrays.asList(f1, f2, f3, f4, f5));
        System.out.print(Arrays.asList(f1, f2, f3, f4, f5));
    }

}
