import java.util.ArrayList;

public class MainBaqnue {
    public static void main(String[] args) {


         /* Instantiation d'un objet Voiture avec les valeurs spécifiques */

        ArrayList<ExoCompteBancaireV2> comptes = new ArrayList<>();

        comptes.add(new ExoCompteBancaireV2(1,"Eudes",3000.25,-1000));
        comptes.add(new ExoCompteBancaireV2(2,"Ludo",15000.0,-1000));
        comptes.add(new ExoCompteBancaireV2(3,"Caro",456550.0,-1000000));

         ExoBanque banque = new ExoBanque(1234, comptes, "Société Générale","Mulhouse" );

         int idCompte = 5;

         ExoCompteBancaireV2 newAccount = new ExoCompteBancaireV2(5,"Hulya",7777777.0,-100000);

         banque.ajouterCompte(4, "Aziz", 4755959,-10000);
         banque.ajouterCompte(newAccount);

         System.out.println("Liste des compte :"+banque.toString());
         System.out.println("Transfert possible ? :"+banque.transfer(banque.rendCompte(5),banque.rendCompte(1), 7777776));
         
         System.out.println("Liste des compte :"+banque.toString());
         
 /* System.out.println("Le plus riche :"+banque.compteSup());
         System.out.println("Trouve moi le compte N°"+idCompte+" : "+banque.rendCompte(idCompte)); */



    }
}