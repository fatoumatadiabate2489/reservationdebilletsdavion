public class PassagerVIP extends Passager {
    // Attribut spécifique à PassagerVIP
    private String codeFidelite;

    public PassagerVIP(String nom, String prenom, String passeport, String codeFidelite) {
        super(nom, prenom, passeport); // Transmet nom, prenom et passeport à Passager
        if (codeFidelite == null || codeFidelite.trim().isEmpty()) {
            System.out.println("Le code de fidélité ne peut pas être vide.");
        }
        this.codeFidelite = codeFidelite;
    }

    public String getCodeFidelite() {
        return codeFidelite;
    }

    // Le passager VIP bénéficie de 15% de réduction
    @Override
    public double calculerReduction() {
        return 0.15;
    }
}