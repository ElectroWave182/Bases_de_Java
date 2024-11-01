import java. util. Random;
class B1
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        int a = 0;
        while(a != 99)
        {
            a = gnr.nextInt(100);
            System.out.println("Seed : " + seed + "\nEntier : " + a);
        }
    }
}
