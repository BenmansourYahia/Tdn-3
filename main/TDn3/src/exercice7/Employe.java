package exercice7;
public abstract class Employe {
    protected String nom;
    protected String prenom;

    public Employe() {
        this("", "");
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getters et Setters
    // ...

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public abstract double gains();
}
