class A13
{
    public static void main(String[] args)
    {
        String s1 = "abcdef";
        boolean test1 = false;
        for(int i = 0; i < s1.length(); i++)
        {
            test1 = test1 || s1.charAt(i) == 'e';
        }
        System.out.println(test1);

        String s2 = "defgh";
        System.out.println(s2.indexOf("e") >= 0);
    }
}
