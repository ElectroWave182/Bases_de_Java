class A17
{
    public static void main(String[] args)
    {
        System.out.println("\nQuelques éléments :");
        char[][] tabl = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g', 'h'}, {'i', 'j', 'k', 'l'}};
        System.out.println(tabl[0][0]);
        System.out.println(tabl[1][3]);

        System.out.println("\nLa 1ère ligne :");
        for(char ele: tabl[0])
        {
            System.out.print(ele + " ");
        }
        System.out.println();

        // System.out.println(tabl[4][2]); -> Ne marche pas, car nous sortons du tableau.

        System.out.println("\nLe tableau entier :");
        for(char[] lig: tabl)
        {
            for(char ele: lig)
            {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
