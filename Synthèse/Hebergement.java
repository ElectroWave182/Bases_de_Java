import java.util.Arrays;
import java.util.ArrayList;

class Hebergement
{

    public String heb;

    public Hebergement(ArrayList<ArrayList<String>> t)
    {
        this.heb = "";
        ArrayList<String> l;
        for(int i = 0; i < t.size(); i++)
        {
            l = t.get(i);
            String nom = l.get(0), ville = l.get(1), dep = l.get(2), wifi = l.get(3), park = l.get(4);
            String end = "";
            if(wifi.equals("Oui"))
            {
                if(park.equals("Oui"))
                {
                    end = " Wifi et parking inclus dans la location";
                }
                else
                {
                    end = " Parking gratuit";
                }
            }
            else if(wifi.equals("Non"))
            {
                end = " Wifi gratuit";
            }
            this.heb += nom + " à " + ville + " (" + dep + ")." + end + "\n";
        }
    }

    public String toString()
    {
        return this.heb;
    }

    public static void main(String[] args)
    {
        ArrayList<ArrayList<String>> tabl = new ArrayList<>();
        ArrayList<String> h1 = new ArrayList<>(Arrays.asList("Les Lilas", "Argelès-sur-mer", "66", "Oui", "Non"));
        ArrayList<String> h2 = new ArrayList<>(Arrays.asList("Les Dunes", "Soorts-Hossegor", "40", "Non", "Oui"));
        ArrayList<String> h3 = new ArrayList<>(Arrays.asList("Les Cormorants", "Saint-Renan", "29", "Oui", "Oui"));
        ArrayList<String> h4 = new ArrayList<>(Arrays.asList("Le Pic", "Bagnères-de-Luchon", "31", "Non", "Non"));
        tabl.add(h1);
        tabl.add(h2);
        tabl.add(h3);
        tabl.add(h4);

        Hebergement h = new Hebergement(tabl);
        System.out.println(h);
    }

}
