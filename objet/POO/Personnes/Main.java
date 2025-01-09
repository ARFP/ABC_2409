

public class Main {
    public static void main(String[] args) {


        // Instantiation d'un objet Personne avec les valeurs spécifiques
        Personne personne1 = new Personne("Eudes", "Konda", 23,false,2500.00,125656.00);

        // Appel de la méthode pour afficher les informations de la personne
        personne1.afficherInfo(personne1.Charge(personne1.getRevenu(),personne1.getAutreRevenu()));

    }
}