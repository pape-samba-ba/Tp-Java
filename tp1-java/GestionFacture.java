public class GestionFacture {
    public static void main(String[] args) {
        System.out.println("nom du produit " +args[0]);
        int quantite = Integer.parseInt(args[2]);
         int prixuni = Integer.parseInt(args[1]);

         double montant = quantite *prixuni;
         System.out.println("produit = " +args[0]);
         System.out.println("prix unitaire = " +prixuni);
         System.out.println("la quantite = " +quantite);
         System.out.println("le montant est " +montant);



    } 
}
