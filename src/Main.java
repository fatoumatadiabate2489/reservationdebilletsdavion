public class Main {
    public static void main(String[] args) {
        vol vol1 = new vol(
            "AF123",
            "Ouagadougou",
            "Paris",
            500000,
            3
        );

        System.out.println("INFORMATIONS DU VOL ");
        vol1.afficher();
        Passager passager1 = new PassagerStandard(
            "Titu",
            "Rho",
            "ABC123",
            "A12"
        );

        System.out.println("\n PASSAGER STANDARD ");
        passager1.afficherPassager();
        System.out.println("Reduction : "
                + (passager1.calculerReduction() * 100) + "%");
        
        Passager passager2 = new PassagerVIP(
            "Koffi",
            "Jean",
            "VIP456",
            "FID789"
        );

        System.out.println("\nPASSAGER VIP ");
        passager2.afficherPassager();
        System.out.println("Reduction : "
                + (passager2.calculerReduction() * 100) + "%");

        Passager passager3 = new Passager(
            "Diallo",
            "Moussa",
            "XYZ789"
        );

        System.out.println("\nPASSAGER CLASSIQUE ");
        passager3.afficherPassager();
        System.out.println("\nRESERVATIONS");

        vol1.reserver_place();
        Reservation reservation1 = new Reservation(
            1001,
            vol1,
            passager1,
            false
        );
        reservation1.confirm_reservation();
        reservation1.afficher_reservation();

        vol1.reserver_place();
        Reservation reservation2 = new Reservation(
            1002,
            vol1,
            passager2,
            false
        );
        reservation2.confirm_reservation();
        reservation2.afficher_reservation();

        vol1.reserver_place();
        Reservation reservation3 = new Reservation(
            1003,
            vol1,
            passager3,
            false
        );
        reservation3.confirm_reservation();
        reservation3.afficher_reservation();
        System.out.println("\n VOL APRES LES RESERVATIONS");
        vol1.afficher();
    }
}
