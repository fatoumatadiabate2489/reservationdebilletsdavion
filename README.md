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
5.**`PassagerStandard.java`** :Classe fille de la classe passager servant à distinguer les attributs des personnes ayant une réservation de type standard.
6.**`PassagerVIP.java`** : Classe fille de la classe passager servant à distinguer les attributs des personnes ayant une réservation de type VIP. 

## 3. Travail d'Équipe & Contributions
Afin d'assurer une collaboration efficace et le suivi individuel sur Git/GitHub :
- **DIABATE Fatoumata** : Implémentation de la classe `Passager.java` et rédaction de la documentation / présentation (`README.md`).
- **TRAORE Houd Tariq Ramadan Togo** : Conception de la classe `Vol.java` et développment de la logique métier dans `Reservation.java`,et finalisation du read.me.
- **ZARE Mohamed Lamine Ridwan** : structuration de la démonstration `Main.java`,et finalisation avec les classes filles.

## Schéma UML d'Architecture
<img width="1280" height="800" alt="Diagramme" src="https://github.com/user-attachments/assets/123511c2-d949-454d-aea2-cdc9d8f940dc" />

- **ZARE Mohamed LAMINE Ridwan** : Conception de la classe `Vol.java` et développment de la logique métier dans `Reservation.java`.
- **TRAORE Houd Ramamadan Tariq Togo** : structuration de la démonstration `Main.java`.

## Schéma UML d'Architecture
<img width="512" height="417" alt="Schema" src="https://github.com/user-attachments/assets/22e7e1c5-6063-459d-aa9e-b3257ca5e6ff" />

## 4. Instructions d'Exécution
1. Cloner le dépôt sur votre environnement local :
   ```bash
   <img width="1280" height="800" alt="Diagramme" src="https://github.com/user-attachments/assets/c119b505-f407-4dd8-b1b4-621662e0dae3" />
   git clone <https://github.com/fatoumatadiabate2489/reservationdebilletsdavion>
