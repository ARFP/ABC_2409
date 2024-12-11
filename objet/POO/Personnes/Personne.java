// Déclaration de la classe Personne
public class Personne {

    private String prenom;
    private String nom;
    private int age;
    private boolean sexe;
    private double revenu;
    private double autreRevenu;

    public Personne(String prenom, String nom, int age, boolean sexe, double Revenu, double autreRevenu) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.sexe = sexe;
        this.revenu = Revenu;
        this.autreRevenu = autreRevenu;
    }
 

    public String getPrenom() {
        return prenom;
    }
 
    public String getNom() {
        return nom;
    }
 
    public int getAge() {
        return age;
    }


    public double getRevenu() {
        return revenu;
    }

    public double getAutreRevenu() {
        return autreRevenu;
    }


    public double Charge(double revenu,double autreRevenu){

        double result = ( revenu * 0.2 + autreRevenu * 0.15 ) ;

        return result;

    } 


    public boolean isSexe() {
        return sexe;
    }
 

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public void afficherInfo(double charge) {
        System.out.println("Prénom: " + prenom);
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);

        if(sexe == true) {

            System.out.println("C'est une femme");

        }else{

            System.out.println("C'est un homme");
        }

        System.out.println("C'est charge sont de :"+charge);


    }
}