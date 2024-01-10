package exercice5;
public class Vehicule {
    private int nbPassager;
    private int nbRoues;

    public Vehicule(int n) {
        this.nbPassager = n;
    }
public int getNbPassager() {
	return nbPassager;
}
public int getNbRoues() {
	return nbRoues;
}

public void setNbRoues(int nbRoues) {
	this.nbRoues = nbRoues;
}

    @Override
    public String toString() {
        return "Vehicule avec " + nbPassager + " passager(s)";
    }
}

