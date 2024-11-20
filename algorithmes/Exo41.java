/*
Exercice 4.1 : Créer un tableau d’entiers
Écrire un algorithme qui déclare un tableau d’entiers
et le remplit avec 7 valeurs numériques 
en les mettant toutes à zéro.
 */

import java.util.Arrays;

public class Exo41 {

    public static void main(String[] args) {
        int[] tableau;

        tableau = new int[7];

        System.out.println("Valeur de la 4ème case: " + tableau[3]);

        tableau[1] = 34;

        System.out.println(Arrays.toString(tableau));

        for(int i = 0; i < tableau.length; i++) {
            System.out.println(i + " = " + tableau[i]);
        }

    }

}
