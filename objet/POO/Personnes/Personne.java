// Déclaration de la classe Personne
public class Personne {
    // Attributs
    private String prenom;
    private String nom;
    private int age;
 
    // Constructeur
    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }
 
    // Getters
    public String getPrenom() {
        return prenom;
    }
 
    public String getNom() {
        return nom;
    }
 
    public int getAge() {
        return age;
    }
 
    // Setters
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    // Méthode pour afficher les informations de la personne
    public void afficherInfo() {
        System.out.println("Prénom: " + prenom);
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }
}