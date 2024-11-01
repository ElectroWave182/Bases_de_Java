class A11
{
    public static void main(String[] args)
    {

        System.out.println("Le tableau lui-même :");
        int[] tabl = {2, 4, 59, 8, 6, 2, 5, 6, 63, 7};
        for(int ele: tabl)
        {
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("\nNombre de multiples de 3 :");
        int cpt = 0;
        for(int ele: tabl)
        {
            if(ele % 3 == 0)
            {
                cpt += 1;
            }
        }
        System.out.println(cpt);

        System.out.println("\nSomme des éléments pairs :");
        int sum1 = 0;
        for(int ele: tabl)
        {
            if(ele % 2 == 0)
            {
                sum1 += ele;
            }
        }
        System.out.println(sum1);

        System.out.println("\nSomme des éléments d'indices pairs :");
        int sum2 = 0;
        boolean drap = true;
        for(int ele: tabl)
        {
            if(drap)
            {
                sum2 += ele;
            }
            drap = !drap;
        }
        System.out.println(sum2);

        System.out.println("\nValeur maximale :");
        int max = tabl[0];
        for(int ele: tabl)
        {
            if(ele > max)
            {
                max = ele;
            }
        }
        System.out.println(max);

        System.out.println("\nPermutations circulaires :");
        int first = tabl[0];
        for(int i = 0; i < tabl.length - 1; i++)
        {
            tabl[i] = tabl[i + 1];
        }
        tabl[tabl.length - 1] = first;
        for(int ele: tabl)
        {
            System.out.print(ele);
            System.out.print(" ");
        }
        System.out.println();

        System.out.println("\nTableau inversé :");
        int current, opposite;
        for(int i = 0; i < tabl.length / 2; i++)
        {
            current = tabl[i];
            opposite = tabl.length - i - 1;
            tabl[i] = tabl[opposite];
            tabl[opposite] = current;
        }
        for(int ele: tabl)
        {
            System.out.print(ele);
            System.out.print(" ");
        }

    }
}
