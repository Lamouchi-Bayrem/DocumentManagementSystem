public class Main {
    public static void main(String[] args) {
        // Création de 5 livres (documents)
        Livre l1 = new Livre("Auteur1", 250, "Titre1", 1990);
        Livre l2 = new Livre("Auteur2", 350, "Titre2", 2000);
        Livre l3 = new Livre("Auteur3", 100, "Titre1", 1980);  // Même titre que l1 pour test recherche
        Livre l4 = new Livre("Auteur4", 400, "Titre4", 2010);
        Livre l5 = new Livre("Auteur5", 200, "Titre5", 1970);

        // Création de la bibliothèque
        Bibliotheque biblio = new Bibliotheque();

        // Ajout des documents
        biblio.ajouterDocument(l1);
        biblio.ajouterDocument(l2);
        biblio.ajouterDocument(l3);
        biblio.ajouterDocument(l4);
        biblio.ajouterDocument(l5);

        // Test suppression
        biblio.supprimerDocument(l5.getId());

        // Test recherche par titre
        System.out.println("Recherche par titre 'Titre1':");
        for (Document d : biblio.rechercherParTitre("Titre1")) {
            d.afficher();
        }

        // Test comparaison
        System.out.println("Comparaison l1 et l2: " + biblio.comparerDocuments(l1.getId(), l2.getId()));  // 1990 < 2000 -> -1

        // Test affichage anciens
        System.out.println("Documents anciens:");
        biblio.afficherDocumentsAnciens();

        // Test statistiques
        biblio.statistiques();

        // Test méthodes spécifiques à Livre (exemple sur l2)
        System.out.println("Prix de l2: " + l2.calculerPrix() + "€");
        System.out.println("l2 est long? " + l2.estLong());
    }
}