package prosit4;

class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;
    private static final int DEFAULT_NBR_HEURES = 0;

    /**
     * Constructs an employee with the specified attributes.
     *
     * @param id        the ID of the employee.
     * @param nom       the name of the employee.
     * @param adresse   the address of the employee.
     * @param nbr_heures the number of hours worked by the employee.
     */
    public Employe(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getnbr_heures() {
        return nbr_heures;
    }

    @Override
    public String toString() {
        return "identifiant : " + id + ", nom : " + nom + ", adresse : " + adresse + ", nombres d'heures : " + nbr_heures;
    }
}