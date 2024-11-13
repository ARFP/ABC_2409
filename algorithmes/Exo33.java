/*
Exercice 3.3 : Les nombres suivants

Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur saisit le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.
 */

 import java.util.Scanner;

public class Exo33 {

    public static void main(String[] args) {

        /* VARIABLES */
        Scanner sc;
        int nbDepart;
        int nbSuivant;
        //int[] nbSuivants;

        /* TRAITEMENT */

        sc = new Scanner(System.in);

        System.out.println("Programme de calcul des 10 prochains nombres.");
        
        System.out.println("Saisissez un nombre Entier : ");

        nbDepart = sc.nextInt(); // 10 - NE pas modifier la valeur de départ

        nbSuivant = nbDepart;

        System.out.print("Les 10 nombres après " + nbDepart +  " sont:");

        while(nbSuivant < nbDepart + 10) {
            nbSuivant++;
            /*nbSuivant += 1;
            nbSuivant = nbSuivant + 1;*/

            System.out.print(nbSuivant + ", ");
        }


        /* AFFICHAGE RESULTAT */


        sc.close();

    }
}
