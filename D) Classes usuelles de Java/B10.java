import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class B10
{
    public static void main(String[] args)
    {
        Random test = new Random();
        int seed = test.nextInt();
        Random gnr = new Random(seed);
        ArrayList<Integer> tabl = new ArrayList<>(Arrays.asList(1, 2, 4));
        int n1 = gnr.nextInt(6) + 1;
        int n2 = gnr.nextInt(6) + 1;
        int n3 = gnr.nextInt(6) + 1;
        System.out.println(n1 + "\n" + n2 + "\n" + n3);
        if(tabl.contains(n1))
        {
            tabl.remove(tabl.indexOf(n1));
            if(tabl.contains(n2))
            {
                tabl.remove(tabl.indexOf(n2));
                if(tabl.contains(n3))
                {
                    System.out.println(true);
                }
                else
                {
                    System.out.println(false);
                }
            }
            else
            {
                System.out.println(false);
            }
        }
        else
        {
            System.out.println(false);
        }
    }
}
