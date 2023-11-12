package prosit4;

public class ProduitCosmetique extends Produit {

    private String type;
    private String marque;

    public ProduitCosmetique(String nom, double prix, String type, String marque) {
        super(nom, prix);
        this.type = type;
        this.marque = marque;
    }

    public String getType() {
        return type;
    }

    public String getMarque() {
        return marque;
    }


    public void apply() {
        System.out.println("Applying " + getNom() + " from " + getMarque());
    }

    public void remove() {
        System.out.println("Removing " + getNom() + " from " + getMarque());
    }
}
