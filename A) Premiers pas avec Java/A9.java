class A9
{
    public static void main(String[] args)
    {
        int c = 10;
        for (int a = 0; a < c; a += 1)
        {
            for (int b = 0; b < c; b += 1)
            {
                System.out.print((a + b) % 2 + " ");
            }
            System.out.println();
        }
    }
}
