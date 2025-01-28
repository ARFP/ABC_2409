import java.util.ArrayList;

public class Conteneur {
    public static void main(String[] args) {


        ArrayList<CreditCard> cards = new ArrayList<>();
        cards.add(new CreditCard(1,"carte Electron",0));
        cards.add(new CreditCard(2,"carte Classic",-1000));
        cards.add(new CreditCard(3,"carte Gold",-5000));

        System.out.println("Mes cartes :"+cards); // Mes cartes  */

        AccountBank account = new AccountBank(123456,"Eudes KONDA",3500.25,cards);
        
        System.out.println("Je peux acheter :"+account.canIbuyit(3700, 1)); /* Si on peut acheter */


    }
}