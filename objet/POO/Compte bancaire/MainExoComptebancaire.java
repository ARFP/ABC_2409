

public class MainExoComptebancaire {
    public static void main(String[] args) {


         /* Instantiation d'un objet Voiture avec les valeurs spécifiques */

         ExoCompteBancaire c1 = new ExoCompteBancaire(12345, "Eudes", 1000, 500); 
         ExoCompteBancaire c2 = new ExoCompteBancaire(12345, "Ludo", 3000, 500); 

         c1.credit(3000.00);

         System.out.println("debit marche ? :"+c1.debit(500.00));
         System.out.println("transfert marche ? :"+c1.transfer(c2,2000));
         System.out.println("Je suis plus riche que Ludo ? :"+c1.compare(c2));
         System.out.println(c1.toString());
         System.out.println(c2.toString());

    }
}