public class Etudiant
{

    private int noteCC, noteCT;
    private String nom;

    public Etudiant(String n, int ncc, int nct)
    {
        this.nom = n;
        this.noteCC = ncc;
        this.noteCT = nct;
    }

    public float moyenne()
    {
        return (this.noteCC + this.noteCT) / 2.f;
    }

    public void affiche()
    {
        System.out.println(this.nom + " a obtenu " + this.moyenne() + " / 20");
    }

    public static void main(String[] args)
    {

        Etudiant e1 = new Etudiant("Kévin", 12, 11);
        Etudiant e2 = new Etudiant("Lucas", 15, 9);

        e1.affiche();
        e2.affiche();

    }

}
