import java.util.Random;
import java.util.ArrayList;
class B4
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed : " + seed);
        int[] chf = new int[10];
        for(int i = 0; i < 10; i++)
        {
            chf[i] = i;
        }
        int a;
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(10);
        for(int i = 0; i < 10; i++)
        {
            a = 10;
            while(liste.contains(a))
            {
                a = gnr.nextInt(10);
            }
            liste.add(chf[a]);
        }
        liste.remove(0);
        System.out.print(liste);
    }
}
