import java.util.Random;

class Pipotron
{
    public static void main(String[] args)
    {
        Random test = new Random();
        int seed = test.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed :\n" + seed);
        String[][] parts = {{"Nonobstant", "En égard à", "Avec", "Malgré", "Considérant"}, {"la difficulté", "l'orientation", "la politique"}, {"que nous constatons", "conjecturelle", "contemporaine", "générale"}};
        for(int i = 0; i < 3; i++)
        {
            for(String[] nat: parts)
            {
                int alea = gnr.nextInt(nat.length);
                System.out.print(nat[alea] + " ");
            }
            System.out.println("...");
        }
    }
}
