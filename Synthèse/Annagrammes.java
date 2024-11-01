import java.util.ArrayList;
import java.util.Collections;

class Annagrammes
{
    public static void main(String[] args)
    {
        String[] liste = {"Impers", "Prisme", "Mires", "Permis", "Primes", "Mepris"};
        String mot1;
        String mot2;
        ArrayList<Character> sMot1 = new ArrayList<>();
        ArrayList<Character> sMot2 = new ArrayList<>();
        int result = 0;
        int taille1;
        int taille2 = liste[0].length();
        boolean annag;
        for(int index = 0; index < liste.length; index++)
        {
            if(index == liste.length - 1)
            {
                mot2 = liste[0].toLowerCase();
            }
            else
            {
                mot2 = liste[index + 1].toLowerCase();
            }
            mot1 = liste[index].toLowerCase();
            sMot1.clear();
            sMot2.clear();
            taille1 = taille2;
            taille2 = mot2.length();
            if(taille1 == taille2)
            {
                for(int i = 0; i < taille1; i++)
                {
                    sMot1.add(mot1.charAt(i));
                    sMot2.add(mot2.charAt(i));
                }
                Collections.sort(sMot1);
                Collections.sort(sMot2);
                annag = sMot1.equals(sMot2);
            }
            else
            {
                annag = false;
            }
            if(!annag)
            {
                if(index == 5 && result == 0)
                {
                    result = -7;
                }
                result += index;
            }
        }
        System.out.print(liste[result / 2 + 1]);
    }
}
