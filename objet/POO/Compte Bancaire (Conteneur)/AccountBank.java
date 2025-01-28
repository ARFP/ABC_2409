// Déclaration de la classe AccountBank

import java.util.List;

public class AccountBank {

    // Définition des attributs de la classe AccountBank
    private int id;
    private String owner;
    private double solde;
    private List<CreditCard> creditCards;

    // Constructeur par défaut
    public AccountBank() {


    }

    // Constructeur avec paramètres
    public AccountBank(int id, String owner, double solde, List<CreditCard> creditCards) {
        
        
        this.id = id;
        this.owner = owner;
        this.creditCards = creditCards;
        this.solde = solde;

    }


    public CreditCard chooseCard(int i){

        return creditCards.get(i);

    }


    public boolean canIbuyit(double amount, int i){

        CreditCard card = chooseCard(i);
        
        return card.getOverdraft() < (this.solde - amount);

    }


}