package exercice2;
class PointNom extends Point {
    private String nom;

    public PointNom(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public void setPointNom(int x, int y, String nom) {
        deplace(x - this.getX(), y - this.getY()); 
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom() {
        System.out.println(nom + " - Coordonnees : "+"(" + getX()+"," + getY()+")");
    }
}

