package exercice5;
public class Avion extends Vehicule {
    private int nbMoteur;

    public Avion(int nbPassager) {
        super(nbPassager);
        this.nbMoteur = 1; // Valeur par défaut
    }

    public Avion(int nbPassager, int nbM) {
        super(nbPassager);
        this.nbMoteur = nbM;
    }

    @Override
    public String toString() {
        return "Avion avec " + getNbPassager() + " passager(s) et " + nbMoteur + " moteur(s)";
    }


	}


