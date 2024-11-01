import java.util.Random;
import java.util.ArrayList;
class B3
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed : " + seed);
        String[] mots = {"am", "stram", "gram"};
        ArrayList<String> liste = new ArrayList<>();
        for(int i = 0; i < 10; i++)
        {
            liste.add(mots[gnr.nextInt(3)]);
        }
        System.out.print(liste);
    }
}
