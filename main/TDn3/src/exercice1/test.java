package exercice1;

public class test {
	public static void main(String[] args) {
	        Point p = new Point(4, 3);
	        PointA P = new PointA(5, 6);
	        P.deplace(2, 2);
	        p.deplace(1, 1);
	     
	        System.out.println("le 1er point après déplacement:");
	        P.affiche(); 
	        System.out.println("le 2eme point après déplacement:");
	        p.affiche();
	    }
	}
