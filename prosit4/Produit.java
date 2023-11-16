package prosit4;


class Produit {
    private final String nom;
    private final double prix;


    public Produit(String nom, double prix) {
        // Add validation if necessary
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return new String(nom); // Defensive copy
    }


    public double getPrix() {
        return prix;
    }


    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Produit produit = (Produit) obj;

        return Double.compare(produit.prix, prix) == 0 && nom.equals(produit.nom);
    }


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
