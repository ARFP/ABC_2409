// Déclaration de la classe CompteBancaire
public class CreditCard {



    // Définition des attributs de la classe CompteBancaire
    private int id;
    private String name;
    private double overdraft;

    CreditCard(){


    }

    public CreditCard(int id, String name, double overdraft) {

        this.id = id;
        this.name = name;
        this.overdraft = overdraft;
    }


    public double getOverdraft(){

        return this.overdraft;
    }


}