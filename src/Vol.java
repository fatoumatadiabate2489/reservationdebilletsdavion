public class Reservation implements Reservable {

    private int numero_billet;
    private Vol vol;
    private Passager passager;
    private boolean confirm_vol = false;

    public Reservation(  int numero_billet, Vol vol, Passager passager,  boolean confirm_vol) {
        this.numero_billet = numero_billet;
        this.vol = vol;
        this.passager = passager;
        this.confirm_vol = confirm_vol;
    }
    @Override
    public boolean reserver() {

        if (confirm_vol) {
            System.out.println("La réservation est déjà confirmée.");
            return false;
        }
        if (vol.reserver_place()) {
            confirm_vol = true;
            System.out.println( "Réservation #" + numero_billet + " effectuée avec succès."
            );
            return true;
        }
        return false;
    }
    @Override
    public boolean annuler() {

        if (!confirm_vol) {
           System.out.println( "La réservation n'est pas confirmée."  );
            return false;
        }
        vol.annuler_place();
        confirm_vol = false;

        System.out.println( "Réservation #" + numero_billet + " annulée."  );
        return true;
    }
    @Override
    public double calculerPrix() {
        double prixBase = vol.getPrix();
        double reduction = passager.calculerReduction();
        return prixBase * (1 - reduction);
    }
    public void confirm_reservation() {
        confirm_vol = true;
    }
    public void afficher_reservation() {
        System.out.println("----- RESERVATION -----");
        System.out.println("Numéro billet : " + numero_billet);
        System.out.println( "Passager : " + passager.getPrenom() + " " +passager.getNom());
        System.out.println("Prix final : " + calculerPrix() );
        System.out.println( "Réservation confirmée : " + confirm_vol );
    }
}
