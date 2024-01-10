package exercice4;
public class Batiment {
    private String adresse;

    public Batiment() {
        this.adresse = "";
    }

    public Batiment(String adresse) {
        this.adresse = adresse;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Bâtiment{adresse='" + adresse + "'}";
    }
}
