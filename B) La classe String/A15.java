class A15
{
    public static void main(String[] args)
    {
        String chaine = "La rue assour[dissante autour de m]oi hurlait.";
        System.out.print(chaine.substring(chaine.indexOf("[") + 1, chaine.indexOf("]")));
    }
}
