public class Fraction {


    private int numerateur;
    private int denominateur;


    public Fraction(){

        this.numerateur = 0;
        this.denominateur = 1;
    }

    public Fraction(int numerateur ){


        this.numerateur = numerateur;
        this.denominateur = 1;

    }


    public Fraction(int numerateur,int denominateur ){


        this.numerateur = numerateur;

        this.denominateur = denominateur;



        reduire();
        toString();

    }

    public int getPgcd()
{
    int a = this.numerateur;
    int b = this.denominateur;
    int pgcd = 1;

    if (a != 0 && b != 0) {
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (a != b) {
            if (a < b) {
                b = b - a;
            } else {
                a = a - b;
            }
        }
        pgcd = a;
    }

    return pgcd;
}


    public String toString(){


        String result="";



        try{

            int divisible = this.numerateur % this.denominateur;

            if(divisible == 0){

                result = ""+this.numerateur / this.denominateur;


            }else{


                positive();

                result = this.numerateur +" / "+ this.denominateur;

            }

            



        }catch(Exception e){


            result = "Erreur : Division par zéro !"+ e;

        }

        return result;

    }


    public void positive(){

        if(this.numerateur<0 && this.denominateur<0 ){

            this.numerateur *= (-1);

            this.denominateur *= (-1);

        }
    }

    public void oppose(){


        this.numerateur*=(-1);

    }


    public void inverse(){


        int temp = this.numerateur;
        this.numerateur=this.denominateur;
        this.denominateur=temp;
        

    }


    public boolean superieurA(Fraction f2) {


        boolean result;

        if(this.numerateur * f2.denominateur > f2.numerateur * this.denominateur){

            result = true;

        }else{

            result = false;        
        }

        return result;

    }


    public boolean egalA(Fraction f2) {

        boolean result;


        if(this.numerateur * f2.denominateur == f2.numerateur * this.denominateur){

            result = true;

        }else{

            result = false;        
        }

        return result;
    }


    public void reduire() {


        int pgcd = getPgcd();

        this.numerateur /= pgcd;
        this.denominateur /= pgcd;

    }

        // Méthode pour additionner deux fractions
        public void addition(Fraction f2) {


            this.numerateur = this.numerateur * f2.denominateur + f2.numerateur * this.denominateur;
            this.denominateur *= f2.denominateur;

            reduire();

        }
    
        // Méthode pour soustraire deux fractions
        public void soustraction(Fraction f2) {

            this.numerateur = this.numerateur * f2.denominateur - f2.numerateur * this.denominateur;
            this.denominateur = this.denominateur * f2.denominateur;

            reduire();
        }
    
        // Méthode pour multiplier deux fractions
        public void multiplication(Fraction f2) {


            try{
                this.numerateur *= f2.numerateur;
                this.denominateur *= f2.denominateur;

            reduire();

            }catch(Exception e){

        
            }


        }
    
        // Méthode pour diviser deux fractions
        public void division(Fraction f2) {


            try{

        this.numerateur *= f2.denominateur;
        this.denominateur *= f2.numerateur;
                reduire();

            }catch(Exception e){

    
            }


        }


    



}