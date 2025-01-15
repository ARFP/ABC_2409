// Déclaration de la classe CompteBancaire
public class ExoCompteBancaire {



    // Définition des attributs de la classe CompteBancaire
    private int id;
    private String owner;
    private double balance;
    private double overdraft;



    public ExoCompteBancaire(){



    }


    public ExoCompteBancaire(int id, String owner, double balance,double overdraft ) {
        
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

    public ExoCompteBancaire( ExoCompteBancaire compteClone ) {

        id = compteClone.id;
        owner = compteClone.owner;
        balance = compteClone.balance;
        overdraft = compteClone.overdraft;

    }


    public String toString(){

        return "le compte n°"+this.id+" de "+this.owner+" a actuellement "+this.balance+" euros , son autorisation de découvert est de "+this.overdraft*(-1);

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
            
            
            public boolean transfer(ExoCompteBancaire beneficiary, double amountToTransfer) {

                boolean result;
                result = this.debit(amountToTransfer);
                if (result) {
                    beneficiary.credit(amountToTransfer);
                }
                return result;
            }


            public boolean compare(ExoCompteBancaire account){


                boolean result;

                if(this.balance > account.balance){

                    result = true;

                }else{

                    result = false;

                }

                return result;


            }


}