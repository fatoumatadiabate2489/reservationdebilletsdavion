public class vols {
    private String numero_vol ;
    private String depart;
    private String arrrive;
    private int prix;
    private int place_dispo;
    public vols(String numero_vol, String depart, String arrive, int prix, int place_dispo){
        this.numero_vol=numero_vol;
        this.depart=depart;
        this.arrrive=arrive;
        this.prix=prix;
        this.place_dispo=place_dispo;
       }
       public void reserver_place(){
        if (place_dispo>0){
            place_dispo--;
            System.out.println("reservation efffectuee");
            System.out.println("places restantes : "+ place_dispo);
        }
        else{
            System.out.println("desole, il n'y a plus de places disponibles.");
        }
       }
    public void afficher(){
        System.out.println("numero de vol"+ numero_vol);
        System.out.println("depart :"+depart);
        System.out.println("arrivee :"+arrrive);
        System.out.println("prix :"+prix);
        System.out.println("places disponibles : "+ place_dispo);
    }
} 