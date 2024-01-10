package exercice7;
public class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
        super();
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
    }

    // Getters et Setters
    // ...

    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" + super.toString() + ", salaire=" + salaire +
               ", commission=" + commission + ", quantite=" + quantite + '}';
    }
}

