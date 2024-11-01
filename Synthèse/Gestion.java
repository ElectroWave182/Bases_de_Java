import java.util.ArrayList;

class Gestion
{

    static ArrayList<Ouvrage> catalogue;

    // Pour ajouter au catalogue

    public static void ajouter(Ouvrage entre)
    {
        int index = 0;
        boolean meme = false;
        for(Ouvrage livre: catalogue)
        {
            meme = livre.titre.equals(entre.titre) && livre.auteur.equals(entre.auteur) && livre.date.equals(entre.date);
            if(meme)
            {
                break;
            }
            index++;
        }
        if(meme)
        {
            int exemplaires = catalogue.get(index).qte;
            entre.qte = exemplaires;
            catalogue.remove(index);
            catalogue.add(entre);
        }
        else
        {
            catalogue.add(entre);
        }
    }

    // Afficher le catalogue

    public String toString()
    {
        String chaine = "";
        Ouvrage livre;
        for(int i = 0; i < this.catalogue.size(); i++)
        {
            livre = this.catalogue.get(i);
            chaine += i + " - " + livre;
        }
        return chaine;
    }

    // Méthode main

    public static void main(String[] args)
    {

        catalogue = new ArrayList<>();

        // Instance des Ouvrages

        Ouvrage o1 = new Ouvrage("Les Aventures d’Alice au pays des merveilles", "Lewis Caroll", 1865, 1);
        Ouvrage o2 = new Ouvrage("Sa Majesté des mouches", "William Golding", 1954, 1);
        Ouvrage o3 = new Ouvrage("Les Aventures de Huckleberry Finn", "Mark Twain", 1884, 1);
        Ouvrage o4 = new Ouvrage("Moby Dick", "Herman Melville", 1851, 1);
        Ouvrage o5 = new Ouvrage("Le Nom de la rose", "Umberto Eco", 1980, 1);
        Ouvrage o6 = new Ouvrage("Le Portrait de Dorian Gray", "Oscar Wilde", 1890, 1);
        Ouvrage o7 = new Ouvrage("Sa Majesté des mouches", "William Golding", 1954, 1);
        Ouvrage o8 = new Ouvrage("Les Aventures d’Alice au pays des merveilles", "Lewis Caroll", 1865, 1);
        Ouvrage o9 = new Ouvrage("Robinson Crusoé"," Daniel Defoe", 1719, 1);
        Ouvrage o10 = new Ouvrage("L’Ile au trésor", "Robert Louis Stevenson", 1883, 1);
        Ouvrage o11 = new Ouvrage("Les Aventures de Tom Sawyer", "Mark Twain", 1876, 1);
        Ouvrage o12 = new Ouvrage("Sa Majesté des mouches", "William Golding", 1954, 1);
        Ouvrage o13 = new Ouvrage("Gargantua", "François Rabelais", 1534, 1);
        Ouvrage o14 = new Ouvrage("L’Etranger", "Albert Camus", 1942, 1);
        Ouvrage o15 = new Ouvrage("Les Raisins de la colère", "John Steinbeck", 1939, 1);

        // Ajout des Ouvrages au catalogue

        ajouter(o1);
        ajouter(o2);
        ajouter(o3);
        ajouter(o4);
        ajouter(o5);
        ajouter(o6);
        ajouter(o7);
        ajouter(o8);
        ajouter(o9);
        ajouter(o10);
        ajouter(o11);
        ajouter(o12);
        ajouter(o13);
        ajouter(o14);
        ajouter(o15);

        System.out.print(catalogue);

    }

}

class Ouvrage
{

    // Attributs à la con

    static String titre, auteur;
    static Integer date, qte;

    // Constructeur

    public Ouvrage(String titre, String auteur, Integer date, Integer qte)
    {
        this.titre = titre;
        this.auteur = auteur;
        this.date = date;
        this.qte = qte;
    }

    // Afficher le catalogue

    public String toString()
    {
        return this.titre + " (" + this.auteur + ", " + this.date + ") [" + this.qte + " exemplaire(s)]\n";
    }

}
