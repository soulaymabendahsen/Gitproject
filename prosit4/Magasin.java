package prosit4;

import java.util.ArrayList;
import java.util.List;

class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private int capacite;
    private List<Produit> produits;
    private List<Employe> employes;

    public Magasin(int id, String nom, String adresse, int capacite) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
        this.employes = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    private void ajouterEmploye(Employe employe) {
        if (employes.size() < 20) {
            employes.add(employe);
        } else {
            System.out.println("Le nombre maximal d'employ�s a �t� atteint pour ce magasin.");
        }
    }


    public void afficherDetails() {
        System.out.println("Magasin " + nom);
        System.out.println("id : " + id);
        System.out.println("Adresse : " + adresse);
        System.out.println("Capacit� : " + capacite);
        System.out.println("Les Produits : ");
        for (Produit produit : produits) {
            System.out.println(produit.getNom() + " - " + produit.getPrix() + " DT");
        }
        System.out.println("Les employ�s : ");
        for (Employe employe : employes) {
            System.out.println(employe);
        }
    }

    public void calculerSalaires() {
        for (Employe employe : employes) {
            double salaire = 0;
            if (employe instanceof Responsable) {
                Responsable responsable = (Responsable) employe;
                salaire = responsable.getnbr_heures() * 10;
                if (responsable.getnbr_heures() > 160) {
                    salaire += (responsable.getnbr_heures() - 160) * 10 * 0.2;
                }
                salaire += responsable.getPrime();
            } else if (employe instanceof Caissier) {
                Caissier caissier = (Caissier) employe;
                salaire = caissier.getnbr_heures() * 5;
                if (caissier.getnbr_heures() > 180) {
                    salaire += (caissier.getnbr_heures() - 180) * 5 * 0.15;
                }
            } else if (employe instanceof Vendeur) {
                Vendeur vendeur = (Vendeur) employe;
                salaire = 450 * (vendeur.getTauxDeVente() / 100);
            }
            System.out.println(employe.getNom() + " salaire est : " + salaire + "dinars");
        }
    }
}
