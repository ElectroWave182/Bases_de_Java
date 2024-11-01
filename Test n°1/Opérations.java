import java.util.Random;

public class Opérations
{
    public static void main(String[] args)
    {
    	int[][] operations = {{1, 5, 6}, {7, 2, 9}, {9, 3, 6}, {8, 3, 11}, {2, 2, 0}};
    	Random rng = new Random();
    	int[] ligne;
    	for(int i = 0; i < 3; i++)
    	{
    		ligne = operations[rng.nextInt(5)];
    		System.out.print("[" + ligne[0] + ", " + ligne[1] + ", " + ligne[2] + "] est une ");
    		if(ligne[0] + ligne[1] == ligne[2])
    		{
    			System.out.println("addition");
    		}
    		else
    		{
    			System.out.println("soustraction");
    		}
    	}
    }
}
