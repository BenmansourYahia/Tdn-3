package exercice6;
public abstract class Figure {
    protected String nom;

    public abstract double getPerimeter();
    public abstract double getAire();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                ", perimetre=" + getPerimeter() +
                ", aire=" + getAire() +
                '}';
    }
}
