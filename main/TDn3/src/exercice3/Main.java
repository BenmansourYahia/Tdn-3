package exercice3;

public class Main {
	    public static void main(String[] args) {
	        Centre centre = new Centre(3, 4, "Centre 1");
	        Cercle cercle = new Cercle(1, 2, "Cercle 1", 5);

	        centre.affiche(); // Affiche les coordonnées et le nom du centre
	        cercle.affiche(); // Affiche les coordonnées, le nom et le rayon du cercle
	    }
	}

