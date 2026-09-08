public class reservation {
    private int numero_billet;
    private vols vol;
    private Passager passagers;
    private boolean confirm_vol;
    public reservation(int numero_billet, vols vol, Passager passagers, boolean confirm_vol){
        this.numero_billet=numero_billet;
        this.confirm_vol=confirm_vol;
        this.vol=vol;
        this.passagers=passagers;
    }
    public void confirm_reservation(){
        confirm_vol=true;
    }
    public void afficher_reservation(){
        System.out.println("numero billet : "+numero_billet);
        System.out.println("vol : "+ vol);
        System.out.println("paasager :"+passagers);
        System.out.println("reservation confirmee :"+comfirm_vol);
    }
}