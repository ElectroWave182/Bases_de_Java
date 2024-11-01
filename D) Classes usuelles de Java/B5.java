import java.util.Random;
import java.util.ArrayList;
class B5
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed : " + seed);
        ArrayList<Integer> liste = new ArrayList<>();
        int a;
        for(int i = 0; i < 20; i++)
        {
            a = gnr.nextInt(20);
            a -= 10;
            liste.add(a);
        }
        System.out.println(liste);
        int ent;
        for(int i = 19; i >= 0; i--)
        {
            ent = liste.get(i);
            if(ent % 2 == 0 || ent < 0)
            {
                liste.remove(i);
            }
        }
        System.out.print(liste);
    }
}
