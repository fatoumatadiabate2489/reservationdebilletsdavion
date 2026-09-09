public class Main {
    public static void main(String[] args) {
        Vol vol1 = new Vol(
            "AF123",
            "Ouagadougou",
            "Paris",
            500000,
            3
        );
        System.out.println("===== INFORMATIONS DU VOL =====");
        vol1.afficher();
        Passager passager1 = new Passager(
            "Titu",
            "Rho",
            "ABC123"
        );
        System.out.println("\n===== INFORMATIONS DU PASSAGER =====");
        passager1.afficherPassager();
        System.out.println("\n===== RESERVATION D'UNE PLACE =====");
        vol1.reserver_place();
        reservation reservation1 = new reservation(
            1001,
            vol1,
            passager1,
            false
        );
        reservation1.confirm_reservation();
        System.out.println("\n===== INFORMATIONS DE LA RESERVATION =====");
        reservation1.afficher_reservation();
        System.out.println("\n===== VOL APRES RESERVATION =====");
        vol1.afficher();
    }
}

