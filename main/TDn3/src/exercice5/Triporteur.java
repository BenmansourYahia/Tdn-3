package exercice5;
public class Triporteur extends Moto {
    public Triporteur(int nbPassager) {
        super(nbPassager);
    }

    @Override
    public String toString() {
        return "Triporteur avec " + getNbPassager() + " passager(s)";
    }
}
