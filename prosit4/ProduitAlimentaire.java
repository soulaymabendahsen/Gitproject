package prosit4;

public class ProduitAlimentaire extends Produit {

    private String dateExpiration;
    private boolean bio;

    public ProduitAlimentaire(String nom, double prix, String dateExpiration, boolean bio) {
        super(nom, prix);
        this.dateExpiration = dateExpiration;
        this.bio = bio;
    }

    public String getDateExpiration() {
        return dateExpiration;
    }

    public boolean isBio() {
        return bio;
    }


    public boolean isExpired() {

        return false;
    }

    
}
