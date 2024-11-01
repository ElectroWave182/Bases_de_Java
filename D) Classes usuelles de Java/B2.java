import java. util. Random;
class B2
{
    public static void main(String[] args)
    {
        Random drap = new Random();
        int seed = drap.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed : " + seed);
        double[] tabl = new double[10];
        for(int i = 0; i < 10; i++)
        {
            tabl[i] = gnr.nextDouble();
        }
        int a;
        for(int i = 0; i < 3; i++)
        {
            a = gnr.nextInt(10);
            System.out.print(tabl[a]);
            if(i != 2)
            {
                System.out.print(", ");
            }
        }
    }
}
