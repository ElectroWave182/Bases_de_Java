import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class B9
{
    public static void main(String[] args)
    {
        // Sans la méthode "sort"
        ArrayList<String> tabl = new ArrayList<>(Arrays.asList("parapluie", "lama", "xylophone", "fenêtre", "baobab"));
        int taille = tabl.size();
        for(int i = 0; i < taille - 1; i++)
        {
            String ele1 = tabl.get(i);
            String ele2 = tabl.get(i + 1);
            if(ele1.compareTo(ele2) > 0)
            {
                tabl.remove(i);
                tabl.add(ele1);
                i--;
                if(i != -1)
                {
                    i--;
                }
            }
        }
        System.out.println(tabl);

        // Avec la méthode "sort"
        ArrayList<String> liste = new ArrayList<>(Arrays.asList("parapluie", "lama", "xylophone", "fenêtre", "baobab"));
        Collections.sort(liste);
        System.out.println(liste);

    }
}
