package prosit4;

/**
 * Represents a salesperson who is an employee.
 */
class Vendeur extends Employe {
    private double tauxDeVente;

    // Constants if applicable
    private static final double DEFAULT_TAUX_DE_VENTE = 0.0;

    /**
     * Constructs a salesperson with the specified attributes.
     *
     * @param id           the ID of the salesperson.
     * @param nom          the name of the salesperson.
     * @param adresse      the address of the salesperson.
     * @param nbrHeures    the number of hours worked by the salesperson.
     * @param tauxDeVente  the sales rate of the salesperson.
     */
    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    /**
     * Gets the sales rate of the salesperson.
     *
     * @return the sales rate of the salesperson.
     */
    public double getTauxDeVente() {
        return tauxDeVente;
    }

    /**
     * Sets the sales rate of the salesperson.
     *
     * @param tauxDeVente the new sales rate to set.
     */
    public void setTauxDeVente(double tauxDeVente) {
        // Add validation if necessary
        this.tauxDeVente = tauxDeVente;
    }
}
