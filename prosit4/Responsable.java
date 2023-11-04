package prosit4;

class Responsable extends Employe {
    protected double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }
}