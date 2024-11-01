class Filtrage
{
    public static void main(String[] args)
    {
        String[] mots = {"essence", "nid", "papillon", "bouleau", "terminal", "travail"};
        for(String mot: mots)
        {
            int taille = mot.length();
            boolean valide = false;
            for(int i = 0; i < taille; i++)
            {
                if(mot.charAt(i) == 'e')
                {
                    valide = true;
                    break;
                }
            }
            if(valide || mot.charAt(taille - 1) == 'l')
            {
                System.out.println(mot);
            }
        }
    }
}
