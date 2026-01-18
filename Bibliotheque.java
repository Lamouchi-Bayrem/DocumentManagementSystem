import java.util.ArrayList;

public class Bibliotheque {
    private ArrayList<Document> documents;

    // Constructeur : initialise la collection
    public Bibliotheque() {
        documents = new ArrayList<>();
    }

    // Ajoute un document si ID unique
    public void ajouterDocument(Document doc) {
        for (Document d : documents) {
            if (d.getId() == doc.getId()) {
                return;  // Ne pas ajouter si duplicata
            }
        }
        documents.add(doc);
    }

    // Supprime par ID
    public void supprimerDocument(int id) {
        for (int i = 0; i < documents.size(); i++) {
            if (documents.get(i).getId() == id) {
                documents.remove(i);
                return;
            }
        }
    }

    // Recherche par titre : retourne liste des matches
    public ArrayList<Document> rechercherParTitre(String titre) {
        ArrayList<Document> result = new ArrayList<>();
        for (Document d : documents) {
            if (d.getTitre().equals(titre)) {
                result.add(d);
            }
        }
        return result;
    }

    // Compare deux documents par année : retourne -1 si d1 < d2, 0 si égal, 1 si d1 > d2
    public int comparerDocuments(int id1, int id2) {
        Document d1 = null, d2 = null;
        for (Document d : documents) {
            if (d.getId() == id1) d1 = d;
            if (d.getId() == id2) d2 = d;
        }
        if (d1 == null || d2 == null) return 0;
        return Integer.compare(d1.getAnneePublication(), d2.getAnneePublication());
    }

    // Affiche les documents anciens en utilisant la méthode afficher() de chaque document
    public void afficherDocumentsAnciens() {
        for (Document d : documents) {
            if (d.estAncien()) {
                d.afficher();
            }
        }
    }

    // Statistiques : total et % de livres
    public void statistiques() {
        int total = documents.size();
        int nbLivres = 0;
        for (Document d : documents) {
            if (d instanceof Livre) nbLivres++;
        }
        double pourcentage = total > 0 ? (double) nbLivres / total * 100 : 0;
        System.out.println("Nombre total de documents : " + total);
        System.out.println("Pourcentage de livres : " + pourcentage + "%");
    }
}