package exercice7;
public class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
        super();
    }

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        super(nom, prenom);
        this.retribution = retribution;
    }

    // Getters et Setters
    // ...

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" + super.toString() + ", retribution=" + retribution +
               ", heures=" + heures + '}';
    }
}
