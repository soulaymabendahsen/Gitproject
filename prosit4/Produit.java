package prosit4;

/**
 * Represents a product with a name and price.
 */
class Produit {
    private final String nom;
    private final double prix;

    /**
     * Constructs a product with the specified name and price.
     *
     * @param nom  the name of the product.
     * @param prix the price of the product.
     */
    public Produit(String nom, double prix) {
        // Add validation if necessary
        this.nom = nom;
        this.prix = prix;
    }

    /**
     * Gets the name of the product.
     *
     * @return the name of the product.
     */
    public String getNom() {
        return new String(nom); // Defensive copy
    }

    /**
     * Gets the price of the product.
     *
     * @return the price of the product.
     */
    public double getPrix() {
        return prix;
    }

    /**
     * Returns a string representation of the product.
     *
     * @return a string representation of the product.
     */
    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

    /**
     * Checks if this product is equal to another object.
     *
     * @param obj the object to compare.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produit produit = (Produit) obj;

        return Double.compare(produit.prix, prix) == 0 && nom.equals(produit.nom);
    }

    /**
     * Generates a hash code for this product.
     *
     * @return the hash code for this product.
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nom.hashCode();
        temp = Double.doubleToLongBits(prix);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
