class A18
{
    public static void main(String[] args)
    {
        int n = 8;
        int[] pascal = new int[n];
        pascal[0] = 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = n - 1; j > 0; j--)
            {
                int current = pascal[j];
                if(current != 0)
                {
                    System.out.print(pascal[j] + " ");
                }
                pascal[j] = pascal[j] + pascal[j - 1];
            }
            System.out.println("1");
        }
    }
}
