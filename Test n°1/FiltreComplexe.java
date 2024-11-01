import java.util.ArrayList;
import java.util.Collections;

public class FiltreComplexe
{
    public static void main(String[] args)
    {
        String mots = "lapin,relatif,lavoir,lampe,revoir,raler,recette,reglage";
        String start;
        String[] tabMots = mots.split(",");
        ArrayList<String> listeMots = new ArrayList<>();
        for(String mot: tabMots)
        {
            start = mot.substring(0, 2);
            if(!(start.equals("la") || start.equals("re") && mot.contains("la")))
            {
                break;
            }
            listeMots.add(mot);
        }
        Collections.sort(listeMots);
        System.out.print(listeMots);
    }
}