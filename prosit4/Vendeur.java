package prosit4;

class Vendeur extends Employe {
    private double tauxDeVente;

    // Constants if applicable
    private static final double DEFAULT_TAUX_DE_VENTE = 0.0;


    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }


    public void setTauxDeVente(double tauxDeVente) {
        // Add validation if necessary
        this.tauxDeVente = tauxDeVente;
    }
}
