class A14
{
    public static void main(String[] args)
    {

        // 1ère méthode

        String s1 = new String("kayak");
        String s2 = new StringBuilder(s1).reverse().toString();
        System.out.println(s1.equals(s2));


        // 2e méthode

        String c1 = "kayak";
        int long = c1.length();
        boolean test = true;
        for(int i = 0; i < long / 2 + 1; i++)
        {
            test = test && c1.charAt(i) == c1.charAt(long - i);
        }
        System.out.println(test);

    }
}
