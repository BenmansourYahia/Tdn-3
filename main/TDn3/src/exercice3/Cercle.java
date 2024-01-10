package exercice3;

class Cercle extends Centre {
	    private int rayon;

	    public Cercle(int x, int y, String nom, int rayon) {
	        super(x, y, nom);
	        this.rayon = rayon;
	    }

	    @Override
	    public void affiche() {
	        super.affiche();
	        System.out.println("Rayon : " + rayon);
	    }
	}
