package prosit4;



class Caissier extends Employe {
    private double numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, double numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public double getnumeroDeCaisse() {
        return numeroDeCaisse;
    }

    @Override
    public String toString() {
        return "Caissier{" +
                "numeroDeCaisse=" + numeroDeCaisse +
                ", id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }
}