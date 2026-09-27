public class Main {

    public static void main(String[] args) {

        Vol vol = new Vol(
                "AB123",
                "Ouagadougou",
                "Dakar",
                100000,
                3
        );

        vol.afficher();

        Passager passagerStandard =
                new PassagerStandard(
                        "Zare",
                        "Lamine",
                        "BK12345",
                        "12A"
                );

        Passager passagerVIP =
                new PassagerVIP(
                        "Diabate",
                        "Fatoumata",
                        "BK67890",
                        "VIP001"
                );

        passagerStandard.afficherPassager();
        passagerVIP.afficherPassager();

        Passager p1 =
                new PassagerStandard(
                        "Traore",
                        "Amadou",
                        "BK11111",
                        "15B"
                );

        Passager p2 =
                new PassagerVIP(
                        "Ouedraogo",
                        "Awa",
                        "BK22222",
                        "VIP002"
                );

        System.out.println("Passager Standard :");
        p1.afficherPassager();
        System.out.println(
                "Reduction : "
                        + (p1.calculerReduction() * 100)
                        + "%"
        );

        System.out.println("\nPassager VIP :");
        p2.afficherPassager();
        System.out.println(
                "Reduction : "
                        + (p2.calculerReduction() * 100)
                        + "%"
        );


        Passager[] passagers = {
                passagerStandard,
                passagerVIP
        };

        for (Passager p : passagers) {
            p.afficherPassager();
            System.out.println(
                    "Reduction : "
                            + (p.calculerReduction() * 100)
                            + "%"
            );
            System.out.println("--------------------------------------");
        }

        Reservation reservation1 =
                new Reservation(
                        1,
                        vol,
                        passagerStandard,
                        false
                );

        Reservation reservation2 =
                new Reservation(
                        2,
                        vol,
                        passagerVIP,
                        false
                );

        Reservable r1 = reservation1;
        Reservable r2 = reservation2;

        System.out.println(
                "Prix Standard : "
                        + r1.calculerPrix()
        );

        System.out.println(
                "Prix VIP : "
                        + r2.calculerPrix()
        );

        Reservable[] reservations = {
                reservation1,
                reservation2
        };

        for (Reservable r : reservations) {
            System.out.println(
                    "Prix de la reservation : "
                            + r.calculerPrix()
            );
        }

        System.out.println("\nReservation 1 :");
        r1.reserver();

        System.out.println("\nReservation 2 :");
        r2.reserver();

        Vol volComplet = new Vol(
                "CD456",
                "Ouagadougou",
                "Abidjan",
                120000,
                2
        );

        volComplet.afficher();

        Reservation reservation3 =
                new Reservation(
                        3,
                        volComplet,
                        passagerStandard,
                        false
                );

        Reservation reservation4 =
                new Reservation(
                        4,
                        volComplet,
                        passagerVIP,
                        false
                );

        System.out.println("\nPremiere reservation :");
        reservation3.reserver();

        System.out.println("\nDeuxieme reservation :");
        reservation4.reserver();

        System.out.println("\nEtat du vol apres deux reservations :");
        volComplet.afficher();

        System.out.println("\nTentative de reservation supplementaire :");
        volComplet.reserver_place();

        System.out.println("\nAnnulation de la reservation 3 :");
        reservation3.annuler();

        System.out.println("\nEtat du vol apres annulation :");
        volComplet.afficher();

        Reservation reservation5 =
                new Reservation(
                        5,
                        volComplet,
                        passagerStandard,
                        false
                );

        System.out.println(
                "Reservation apres liberation d'une place :"
        );

        reservation5.reserver();


        System.out.println("\nReservation Standard :");
        reservation1.afficher_reservation();

        System.out.println("\nReservation VIP :");
        reservation2.afficher_reservation();

        System.out.println("\nEtat final du vol :");
        volComplet.afficher();



    }
}


