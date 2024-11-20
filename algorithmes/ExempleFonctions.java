import java.util.Scanner;

public class ExempleFonctions {

    public static void main(String[] args) {
        System.out.println("Saisie des informations d'une personne");

        Scanner sc;
        String nom;
        String prenom;
        int age;
        int ageDans10ans;

        sc = new Scanner(System.in);


        // L'utilisateur doit saisir un nom qui doit contenir 2 lettres minimum       
        do {
            System.out.println("Saisir le nom: ");
            nom = sc.nextLine();

        } while(nom.length() < 2);

        // L'utilisateur doit saisir un prénom qui doit contenir 2 lettres minimum 
        // L'utilisateur doit saisir un âge qui doit être supérieur à 18
        // Le programme affiche les 3 informations
        // Le programme calcule et affiche l'âge de la personne dans 10 ans.

        sc.close();

    } // fin du main



} // fin de la classe
