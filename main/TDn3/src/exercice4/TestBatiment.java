package exercice4;
public class TestBatiment {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("123 Rue Principale");
        Maison maison = new Maison("456 Avenue de la Liberté", 5);
        Immeuble immeuble = new Immeuble("789 Boulevard de la Paix", 10);

        System.out.println(batiment);
        System.out.println(maison);
        System.out.println(immeuble);
    }
}


