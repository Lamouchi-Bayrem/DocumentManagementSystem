import java.util.ArrayList;  // Importé pour la classe Bibliotheque (bien que non utilisé directement ici)

public abstract class Document {
    private int id;
    private String titre;
    private int anneePublication;
    private static int nbDocuments = 0;

    // Constructeur par défaut : ID auto-incrémenté, valeurs vides
    public Document() {
        nbDocuments++;
        this.id = nbDocuments;
        this.titre = "";
        this.anneePublication = 0;
    }

    // Constructeur sans ID : ID auto-incrémenté
    public Document(String titre, int anneePublication) {
        nbDocuments++;
        this.id = nbDocuments;
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    // Constructeur complet : ID fourni par l'utilisateur
    public Document(int id, String titre, int anneePublication) {
        nbDocuments++;
        this.id = id;
        this.titre = titre;
        this.anneePublication = anneePublication;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    public int getAnneePublication() { return anneePublication; }
    public void setAnneePublication(int anneePublication) { this.anneePublication = anneePublication; }
    public static int getNbDocuments() { return nbDocuments; }

    // Méthode toString() pour formatage
    @Override
    public String toString() {
        return "ID: " + id + ", Titre: " + titre + ", Année: " + anneePublication;
    }

    // Méthode d'affichage : affiche les infos via toString()
    public void afficher() {
        System.out.println(this.toString());
    }

    // Méthode abstraite à implémenter dans les sous-classes
    public abstract boolean estAncien();
}