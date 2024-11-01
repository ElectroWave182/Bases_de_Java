import java.util.Random;
import java.util.ArrayList;

class Variations
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed: " + seed + "\n");
        String mot = "crane";
        ArrayList<String> liste = new ArrayList<>();
        int longueur = mot.length();
        int var;
        String[] tabl = mot.split("");
        String[] anag;
        for(int r = 0; r < 6; r++)
        {
            anag = new String[longueur];
            for(String c: tabl)
            {
                while(true)
                {
                    var = gnr.nextInt(longueur);
                    if(anag[var] == null)
                    {
                        anag[var] = c;
                        break;
                    }
                }
            }
            liste.add(String.join("", anag));
        }
        System.out.print(liste);
    }
}
