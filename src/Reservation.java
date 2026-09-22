public class Reservation {
    private int numero_billet;
    private Vol vol;
    private Passager passagers;
    private boolean confirm_vol =false;
    

    public Reservation(int numero_billet, Vol vol, Passager passagers, boolean confirm_vol){
        this.numero_billet=numero_billet;
        this.confirm_vol=confirm_vol;
        this.vol=vol;
        this.passagers=passagers;
    }
    public void confirm_reservation(){
        this.confirm_vol=true;
    }
    public void afficher_reservation(){
        System.out.println("numero billet : "+numero_billet);
        System.out.println("vol : "+ vol);
        System.out.println("passager :"+passagers);
        System.out.println("reservation confirmee :"+confirm_vol);
    }
}
