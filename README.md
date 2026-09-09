# Présentation du Projet : Système de Réservation de Billets d'Avion

## 1. Contexte & Objectifs
Ce projet a été réalisé et présenté dans le cadre du cours de Programmation Orientée Objet en Java.
L'objectif est de concevoir un système automatisé de gestion et de réservation de billets d'avion garantissant :
- La gestion de la disponibilité des places sur les vols.
- L'enregistrement complet des passagers.
- La confirmation de réservation et l'édition de billets.

## 2. Architecture Orientée Objet
L'application repose sur une architecture modulaire composée de 4 classes principales :

1. **`Vol.java`** : Contient les informations relatives aux trajets (numéro de vol, ville de départ, ville d'arrivée, prix de base, place disponible) et gère le décompte des places disponibles.
2. **`Passager.java`** : Représente l'utilisateur de la compagnie (nom, prénom,passeport) et permet la présentation de son profil.
3. **`Reservation.java`** : Classe centrale qui relie un passager à un vol et valide l'émission du billet sous condition de places disponibles.
4. **`Main.java`** : Classe principale d'exécution servant à simuler le parcours complet d'une réservation.


## 3. Travail d'Équipe & Contributions
Afin d'assurer une collaboration efficace et le suivi individuel sur Git/GitHub :
- **Fatoumata Diabaté** : Implémentation de la classe `Passager.java` et rédaction de la documentation / présentation (`README.md`).
- **Coéquipier 1** : Conception de la classe `Vol.java` et développment de la logique métier dans `Reservation.java`.
- **Coéquipier 2** : structuration de la démonstration `Main.java`.

## Schéma UML d'Architecture
<img width="512" height="417" alt="Schema" src="https://github.com/user-attachments/assets/22e7e1c5-6063-459d-aa9e-b3257ca5e6ff" />

## 4. Instructions d'Exécution
1. Cloner le dépôt sur votre environnement local :
   ```bash
   git clone <https://github.com/fatoumatadiabate2489/reservationdebilletsdavion>
