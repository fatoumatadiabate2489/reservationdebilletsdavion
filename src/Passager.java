public abstract class Passager {
    protected String nom;
    protected String prenom;
    protected String passeport;
    public Passager(String nom,String prenom,String passeport) {
        this.nom=nom;
        this.prenom=prenom;
        this.passeport=passeport;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPasseport() {
        return passeport;
    }

    public void afficherPassager() {
        System.out.println("Passager:"+ prenom +" "+nom+"(Passeport:"+ passeport + ")");
    }

    // Le passager standard ne bénéficie d'aucune réduction (0%)
    public abstract double calculerReduction();
}
