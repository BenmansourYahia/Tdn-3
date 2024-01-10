package exercice7;
public class Patron extends Employe {
    private double salaire;

    public Patron() {
        super();
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    // Getters et Setters
    // ...

    @Override
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Patron{" + super.toString() + ", salaire=" + salaire + '}';
    }
}

