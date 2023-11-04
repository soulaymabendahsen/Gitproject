package prosit4;

public class GestionMagasins {
    public static void main(String[] args) {
    	
    	  Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville", 20);
          Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6", 20);
      
          Employe caissier1 = new Caissier(4, "Caissier1", "Centre-Ville", 100, 2);
          Employe caissier2 = new Caissier(4, "Caissier2", "Menzah 6", 170, 5);
       
          Employe vendeur1 = new Vendeur(5, "Vendeur1", "Centre-Ville", 140, 15);
          Employe vendeur2 = new Vendeur(6, "Vendeur2", "Centre-Ville", 160, 12);
          Employe vendeur3 = new Vendeur(7, "Vendeur3", "Centre-Ville", 175, 8);
          
          Employe responsable1 = new Responsable(10, "Responsable1", "Menzah 6", 165, 120);
        
          magasin1.ajouterEmploye(caissier1);
          magasin1.ajouterEmploye(caissier2);
          magasin1.ajouterEmploye(vendeur1);
          magasin1.ajouterEmploye(vendeur2);
          magasin1.ajouterEmploye(vendeur3);
          magasin1.ajouterEmploye(responsable1);
          
          
          Employe vendeur4 = new Vendeur(5, "Vendeur4", "Centre-Ville", 140, 15);
          Employe vendeur5 = new Vendeur(6, "Vendeur5", "Centre-Ville", 160, 12);
          Employe vendeur6 = new Vendeur(7, "Vendeur6", "Centre-Ville", 175, 8);
          
          Employe responsable2 = new Responsable(10, "Responsable2", "Menzah 6", 165, 120);
          

          magasin2.ajouterEmploye(vendeur4);
          magasin2.ajouterEmploye(vendeur5);
          magasin2.ajouterEmploye(vendeur6);
          magasin2.ajouterEmploye(responsable2);
          
          
          System.out.println("caracteristiques des employés magasin 1 :");
          magasin1.afficherDetails();
          magasin2.afficherDetails();
          
          Produit produit1 = new Produit("Produit1", 1.5);
          Produit produit2 = new Produit("Produit2", 2.0);
          
          magasin1.ajouterProduit(produit1);
          magasin1.ajouterProduit(produit2);
          
          Produit produit3 = new Produit("Produit3", 5.5);
          Produit produit4 = new Produit("Produit4", 2.0);
          
          magasin2.ajouterProduit(produit3);
          magasin2.ajouterProduit(produit4);
          
          System.out.println("Les caractéristiques des employés magasin 2 :");
          magasin1.afficherDetails();
          magasin2.afficherDetails();

          System.out.println("les salaires des employés :");
          magasin1.calculerSalaires();
          magasin2.calculerSalaires();
    	
    }
}