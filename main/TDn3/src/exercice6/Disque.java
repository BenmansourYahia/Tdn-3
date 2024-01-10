package exercice6;
public class Disque extends Figure {
    private Point centre;
    private double rayon;

    public Disque() {
        this(new Point(0, 0), 0);
    }

    public Disque(Point centre, double rayon) {
        this(centre, rayon, "Disque");
    }

    public Disque(Point centre, double rayon, String nom) {
        this.setCentre(centre);
        this.rayon = rayon;
        this.nom = nom;
    }

    // Getters et Setters
    // ...

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public double getAire() {
        return Math.PI * rayon * rayon;
    }

	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}
}

