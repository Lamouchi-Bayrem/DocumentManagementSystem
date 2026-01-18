public class Livre extends Document {
    private String auteur;
    private int nbPages;

    // Constructeur sans ID : appelle super sans ID
    public Livre(String auteur, int nbPages, String titre, int anneePublication) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    // Constructeur avec ID : appelle super avec ID
    public Livre(int id, String auteur, int nbPages, String titre, int anneePublication) {
        super(id, titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    // Getters et Setters supplémentaires
    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }
    public int getNbPages() { return nbPages; }
    public void setNbPages(int nbPages) { this.nbPages = nbPages; }

    // Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", Auteur: " + auteur + ", Pages: " + nbPages;
    }

    // Surcharge de afficher() : utilise la toString() surchargée
    @Override
    public void afficher() {
        System.out.println(this.toString());
    }

    // Implémentation de estAncien() : plus de 30 ans
    @Override
    public boolean estAncien() {
        int anneeCourante = 2026;  // Année actuelle (fixée pour l'exercice)
        return (anneeCourante - getAnneePublication()) > 30;
    }

    // Méthode pour calculer le prix (0.10€ par page)
    public double calculerPrix() {
        return 0.10 * nbPages;
    }

    // Méthode pour vérifier si long (> 300 pages)
    public boolean estLong() {
        return nbPages > 300;
    }
}