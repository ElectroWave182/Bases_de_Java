import java.util.Random;

class MotDePasse
{
    public static void main(String[] args)
    {
        Random test = new Random();
        int seed = test.nextInt();
        Random gnr = new Random(seed);
        System.out.println("Seed :\n" + seed);
        char[] speciaux = {'$', '&', '!', '?', '@'};
        char[] mdp = new char[8];
        char alea;
        char symbol;
        for(int i = 0; i < 8; i++)
        {
            alea = (char)(gnr.nextInt(26) + gnr.nextInt(2) * 32 + 65);
            mdp[i] = alea;
        }
        for(int i = 0; i < 2; i++)
        {
            symbol = speciaux[gnr.nextInt(5)];
            mdp[gnr.nextInt(8)] = symbol;
        }
        for(int i = 0; i < 8; i++)
        {
            System.out.print(mdp[i]);
        }
    }
}
