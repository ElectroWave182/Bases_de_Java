class A4
{
    public static void main(String[] args)
    {
        int a = 54;
        int b = 78;
        int c = 62;
        if (a > b)
        {
            if (a > c)
            {
                if (b > c)
                {
                    System.out.print(b);
                }
                else
                {
                    System.out.print(c);
                }
            }
            else
            {
                System.out.print(a);
            }
        }
        else if (a > c)
        {
            System.out.print(a);
        }
        else if (b > c)
        {
            System.out.print(c);
        }
        else
        {
            System.out.print(b);
        }
    }
}
