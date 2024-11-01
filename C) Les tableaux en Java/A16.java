class A16
{
    public static void main(String[] args)
    {
        String groupe = "";
        String phrase = "Ceci n'est pas une phrase.";
        String[] apos = phrase.split(" ");
        System.out.println(phrase);
        for(String part: apos)
        {
            String[] mots = part.split("'");
            for(String mot: mots)
            {
                if(mot.length() > 3)
                {
                    groupe += mot + " ";
                }
            }
        }
        System.out.print(groupe);
    }
}
