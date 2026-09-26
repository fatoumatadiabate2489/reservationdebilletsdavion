# Présentation du Projet : Système de Réservation de Billets d'Avion

## 1. Contexte & Objectifs
Ce projet a été réalisé et présenté dans le cadre du cours de Programmation Orientée Objet en Java.
L'objectif est de concevoir un système automatisé de gestion et de réservation de billets d'avion garantissant :
- La gestion de la disponibilité des places sur les vols.
- L'enregistrement complet des passagers.
- La confirmation de réservation et l'édition de billets.

##  Architecture du Code & Conceptions POO

Le projet est entièrement structuré sous le répertoire src/ et respecte la répartition suivante :

### 1. Abstraction et Encapsulation (Passager.java)
- *Classe abstraite Passager* : Sert de classe mère non instanciable pour tous les types de passagers.
- *Encapsulation protected* : Les attributs nom, prenom et passeport sont déclarés en protected afin d'être accessibles directement dans les sous-classes tout en restant protégés contre les accès externes directs.
- *Méthode abstraite calculerReduction()* : Définit la signature de calcul de réduction imposée à toutes les sous-classes.

### 2. Héritage et Spécialisation (PassagerStandard.java & PassagerVIP.java)
- *PassagerStandard* : 
  - Hérite de Passager via le mot-clé extends.
  - Ajoute l'attribut spécifique siegeAssigne (private).
  - Implémente @Override public double calculerReduction() qui renvoie *0.0* (0% de réduction).
- *PassagerVIP* : 
  - Hérite de Passager via le mot-clé extends.
  - Ajoute l'attribut spécifique codeFidelite (private) avec vérification de validité au constructeur (null ou chaîne vide).
  - Implémente @Override public double calculerReduction() qui renvoie *0.15* (15% de réduction privilège).

### 3. Polymorphisme en Action (Main.java)
- La classe Main exploite pleinement le *polymorphisme de sous-typage* :
  - Manipulation d'une collection ou d'un tableau de référence de type général *Passager* contenant des instances mixtes (PassagerStandard et PassagerVIP).
  - Appel dynamique de la méthode calculerReduction() lors du parcours du tableau : Java exécute automatiquement l'implémentation propre à chaque sous-classe au moment de l'exécution.

### 4. Modules Complémentaires
- *Vol.java* : Contient les informations de vol (numéro, destination, capacité) et gère la disponibilité des sièges.
- *Reservation.java* : Fait la liaison entre un objet Passager et un objet Vol.
- *Reservable.java* : Interface définissant le contrat d'opérations de réservation.

## 2 Déclaration d'usage de l'Intelligence Artificielle (IA)
Conformément aux consignes, nous déclarons l'utilisation ponctuelle d'assistants IA (Gemini) pour :
1. La compréhension de la structuration des projets Java sous Git/GitHub.
2. La relecture syntaxique des interfaces et de la documentation.
   
## 3. Travail d'Équipe & Contributions
Afin d'assurer une collaboration efficace et le suivi individuel sur Git/GitHub :
- Lamine ZARE : Structure, interface Reservable, classe Vol et Reservation.
- Fatoumata DIABATE : Classe Passager, sous-classes et documentation README.md.
- TRAORE Tariq : Tests post-clonage et scénarios de validation dans Main.java

## Schéma UML d'Architecture
<img width="1076" height="1220" alt="image" src="https://github.com/user-attachments/assets/94d3f908-fc55-4763-ad46-8526b4ada0bf" />


## 4. Instructions d'Exécution
1. Cloner le dépôt sur votre environnement local :
   ```bash
   git clone 
   [https://github.com/fatoumatadiabate2489/reservationdebilletsdavion.git]
