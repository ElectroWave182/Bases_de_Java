class Occurences
{
    public static void main(String[] args)
    {
        String chaine = "agttaggtagtaattagtttgtaagatgattagagtggattataaagtagtaagtaat";
        String sChaine = "agt";
        int taille = sChaine.length();
        int occur = 0;
        int cpt = 0;
        char car;
        for(int i = 0; i < chaine.length(); i++)
        {
            if(chaine.charAt(i) == sChaine.charAt(cpt))
            {
                cpt++;
            }
            else
            {
                if(cpt != 0)
                {
                    i--;
                }
                cpt = 0;
            }
            if(cpt == taille)
            {
                occur++;
                cpt = 0;
            }
        }
        System.out.print(occur);
    }
}
