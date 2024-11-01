public class Tank
{

    public String nom;
    private double niveauDeVie;
    public static int PUISSANCE = 50;

    public Tank(String n)
    {
        this.nom = n;
        this.niveauDeVie = 100;
    }

    public boolean estVivant()
    {
        return this.niveauDeVie > 0;
    }

    public void attaque(Tank k)
    {
        System.out.println(this.nom + " attaque " + k.nom);
        double degat = Tank.PUISSANCE * Math.random();
        k.infligerDegat(degat);
    }

    public void infligerDegat(double d)
    {
        this.niveauDeVie -= d;
    }

}
