// Déclaration de la classe Personne
public class Bouteille {



    // Définition des attributs de la classe Personne
    private boolean estOuvert;
    private float contenanceEnML;
    private float contenuEnPourcentage;



    public Bouteille(){

    }


    public Bouteille(boolean estOuvert, float contenanceEnML, float contenuEnPourcentage) {
        this.estOuvert = estOuvert;
        this.contenanceEnML = contenanceEnML;
        this.contenuEnPourcentage = contenuEnPourcentage;

    }

    public Bouteille(Bouteille b1) {
       
    }

    public boolean isEstOuvert() {
        return estOuvert;
    }
 
    public float getContenanceEnML() {
        return contenanceEnML;
    }
 
    public float getContenuEnPourcentage() {
        return contenuEnPourcentage;
    }


    public void setEstOuvert(boolean estOuvert) {
        this.estOuvert = estOuvert;
    }

    public void setContenanceEnML(float contenanceEnML) {
        this.contenanceEnML = contenanceEnML;
    }

 
    public void setContenuEnPourcentage(float contenuEnPourcentage) {
        this.contenuEnPourcentage = contenuEnPourcentage;
    }


    public boolean vider() {

        if(estOuvert == true){

            contenanceEnML = 0;
            contenuEnPourcentage = 0;

            return true;

        }else{

            return false;
        }

    }

    public boolean vider(float pourcentageAvider) {

        if(estOuvert == true){

            contenuEnPourcentage = contenuEnPourcentage - pourcentageAvider;
            contenanceEnML = contenanceEnML - ( contenanceEnML * (contenuEnPourcentage/100)) ;

            return true;

        }else{

            return false;
        }


    }


    public boolean remplir() {

        if(estOuvert == true || contenuEnPourcentage > 100){

            contenanceEnML = (contenanceEnML * 100) / contenuEnPourcentage;
            contenuEnPourcentage = 100;

            return true;

        }else{

            return false;
        }

    }

    public boolean remplir(float pourcentageRemplir) {

        if(estOuvert == true || contenuEnPourcentage > 100 ){

            contenuEnPourcentage = contenuEnPourcentage + pourcentageRemplir;
            contenanceEnML = contenanceEnML + ( contenanceEnML * (contenuEnPourcentage/100)) ;

            return true;

        }else{

            return false;
        }


    }


    public String toString(){

        String message = "";

        if(estOuvert == true){

            message += "la bouteille est ouverte";


        }else{

            message += "la bouteille est fermée";
        }

        if(contenuEnPourcentage == 100){

            message += "la bouteille est pleine";


        }else{

            message += "la bouteille contient "+contenanceEnML+" ml";
        }


        if(contenuEnPourcentage == 0){

            message += "la bouteille est vide";


        }else{

            message += "la bouteille contient "+contenanceEnML+" ml";
        }


        return message;



    }




}