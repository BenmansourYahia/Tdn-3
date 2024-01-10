package exercice7;
public class TestEmploye {
    public static void main(String[] args) {
        Employe patron = new Patron("Scott", "Micheal", 5000);
        Employe travailleurComm = new TravailleurCommission("Halpert", "Jim", 1500, 50);
        Employe travailleurHoraire = new TravailleurHoraire("Schrute", "Dwight", 20);

        System.out.println(patron);
        System.out.println(travailleurComm);
        System.out.println(travailleurHoraire);
    }
}
