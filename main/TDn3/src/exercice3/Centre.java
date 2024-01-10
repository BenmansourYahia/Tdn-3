package exercice3;
class Centre extends Point {
	    private String nom;

	    public Centre(int x, int y, String nom) {
	        super(x, y);
	        this.nom = nom;
	    }

	    public void affNom() {
	        System.out.println("Nom : " + nom);
	    }

	    @Override
	    public void affiche() {
	        super.affCoord();
	        System.out.println("Nom : " + nom);
	    }
	}