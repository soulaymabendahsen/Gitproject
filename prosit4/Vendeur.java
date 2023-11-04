package prosit4;

class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbrHeures, double tauxDeVente) {
        super(id, nom, adresse, nbrHeures);
        this.tauxDeVente = tauxDeVente;
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }
}