package exercice6;
public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this(longueur, largeur, "Rectangle");
    }

    public Rectangle(double longueur, double largeur, String nom) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.nom = nom;
    }

    // Getters et Setters
    // ...

    @Override
    public double getPerimeter() {
        return 2 * (longueur + largeur);
    }

    @Override
    public double getAire() {
        return longueur * largeur;
    }
}

