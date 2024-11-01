import java.util.Random;
import java.util.ArrayList;
class B11
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed : " + seed);
        ArrayList<Object> liste = new ArrayList<>();
        int a;
        for(int i = 0; i < 20; i++)
        {
            a = gnr.nextInt(2);
            if(a == 0)
            {
                liste.add(gnr.nextInt(10));
            }
            else
            {
                liste.add(gnr.nextInt(2) == 0);
            }
        }
        System.out.print(liste);
    }
}
