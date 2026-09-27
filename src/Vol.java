public class Vol {

    private String numero_vol;
    private String depart;
    private String arrive;
    private int prix;
    private int place_dispo;

    public Vol(String numero_vol,  String depart,String arrive,  int prix,  int place_dispo) {

        this.numero_vol = numero_vol;
        this.depart = depart;
        this.arrive = arrive;
        this.prix = prix;
        this.place_dispo = place_dispo;
    }

    public boolean reserver_place() {

        if (place_dispo > 0) {

            place_dispo--;
            System.out.println("Réservation effectuée.");
            System.out.println( "Places restantes : " + place_dispo
            );
            return true;
        }
        System.out.println(
            "Désolé, il n'y a plus de places disponibles."
        );
        return false;
    }
    public void annuler_place() {

        place_dispo++;

        System.out.println(  "Place libérée."  );
        System.out.println(  "Places disponibles : " + place_dispo    );
    }
    public int getPrix() {
        return prix;
    }
    public int getPlaceDispo() {
        return place_dispo;
    }
    public void afficher() {
        System.out.println("----- VOL -----");
        System.out.println("Numéro de vol : " + numero_vol);
        System.out.println("Départ : " + depart);
        System.out.println("Arrivée : " + arrive);
        System.out.println("Prix : " + prix);
        System.out.println(
            "Places disponibles : " + place_dispo
        );
    }
}
