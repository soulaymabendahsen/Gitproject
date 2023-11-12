package prosit4;

class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    // Add a new method
    public void setPrime(double prime) {
        this.prime = prime;
    }
    
    public double calculerSalaireAvecPrime(int a) {
        // Add logic to calculate the salary including the prime
        double salaireSansPrime = a; 
        return salaireSansPrime + prime;
    }
    public void augmenterPrime(double pourcentageAugmentation) {
        this.prime = this.prime + (this.prime * pourcentageAugmentation / 100);
    }
}
