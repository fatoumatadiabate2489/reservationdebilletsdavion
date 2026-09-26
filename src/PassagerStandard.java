public class PassagerStandard extends Passager {
    // Attribut spécifique à PassagerStandard
    private String siegeAssigne;

    public PassagerStandard(String nom, String prenom, String passeport, String siegeAssigne) {
        super(nom, prenom, passeport); // Transmet nom, prenom et passeport à Passager
        this.siegeAssigne = siegeAssigne;
    }

    public String getSiegeAssigne() {
        return siegeAssigne;
    }

    // Le passager standard ne bénéficie d'aucune réduction (0%)
    @Override
    public double calculerReduction() {
        return 0.0;
    }
}