package exercice2;

public class Test{
    public static void main(String[] args) {
        PointNom pn = new PointNom(5, 10, "Point A");// Affiche les coordonnées initiales et le nom
        pn.affCoordNom();

        pn.setPointNom(8, 12, "Point B"); // Affiche les nouvelles coordonnées et le nouveau nom
        pn.affCoordNom(); 

        pn.setNom("Point C");// Affiche les coordonnées avec le nom mis à jour
        pn.affCoordNom();  
}
}
