// Déclaration de la classe CompteBancaire
public class ExoCompteBancaireV2 {



    // Définition des attributs de la classe CompteBancaire
    private int id;
    private String owner;
    private double balance;
    private double overdraft;



    public ExoCompteBancaireV2(){



    }


    public ExoCompteBancaireV2(int id, String owner, double balance,double overdraft ) {
        
        /* Initailisation des attributs */

        this.id = id;
        this.owner = owner;
        this.balance = balance;

        if(overdraft>0){

            this.overdraft = overdraft * (-1);

        }else{

            this.overdraft = overdraft;
        }



    }

    public ExoCompteBancaireV2( ExoCompteBancaireV2 compteClone ) {

        id = compteClone.id;
        owner = compteClone.owner;
        balance = compteClone.balance;
        overdraft = compteClone.overdraft;

    }


    public String toString(){

        return "le compte n°"+this.id+" de "+this.owner+" a actuellement "+this.balance+" euros , son autorisation de découvert est de "+this.overdraft*(-1);

    }


    
    public int getId(){

        return this.id;
    }


    public double getBalance(){

        return this.balance;
    }

    public void credit(double amount){

        this.balance += amount;
        
        
        }


        public boolean  debit(double amount){

            boolean flag;
            double result = this.balance - amount;
            
            if(result > this.overdraft){
            
            flag = true;
            this.balance -= amount;
            
            }else{
            
            flag = false;
            
            }
            
            return flag;
            
            }
            
            
            public boolean transfer(ExoCompteBancaireV2 beneficiary, double amountToTransfer) {

                boolean result;
                result = this.debit(amountToTransfer);

                if (result) {
                    beneficiary.credit(amountToTransfer);
                }
                return result;
            }

            public boolean compare(ExoCompteBancaireV2 account){


                boolean result;

                if(this.balance > account.balance){

                    result = true;

                }else{

                    result = false;

                }

                return result;


            }


}