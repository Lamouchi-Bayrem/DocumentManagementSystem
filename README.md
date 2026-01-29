# Système de Gestion de Documents Multimédias

## Description
Ce projet est un système simple de gestion de documents multimédias en Java. Il gère des documents abstraits (comme des livres) avec des fonctionnalités telles que l'ajout, la suppression, la recherche, la comparaison par année, l'affichage des documents anciens, et des statistiques aussi que la facturation et le suivi des incident et genration des tiket 

- **Classe Abstraite Document** : Base pour tous les documents avec ID, titre, année de publication.
- **Classe Livre** : Étend Document pour les livres, avec auteur et nombre de pages. Inclut des méthodes pour vérifier si ancien (>30 ans) et calculer le prix.
- **Classe Bibliotheque** : Gère une collection de documents via ArrayList.
- **Classe Main** : Tests et démonstration.

Ce projet est basé sur un exercice universitaire (ISI, 2026) et peut être étendu à d'autres types de documents.

## Prérequis
- Java JDK 8 ou supérieur.

## Comment Exécuter
1. Clonez le repo : `git clone https://github.com/votreusername/DocumentManagementSystem.git`
2. Compilez : `javac src/*.java`
3. Exécutez : `java -cp src Main`

## Améliorations Futures
- Ajouter d'autres types de documents (e.g., Vidéo, Audio).
- Intégrer une interface graphique (Swing ou JavaFX).
- Utiliser une base de données pour la persistance.

## Licence
MIT License
