public class ExempleTableaux {
    public static void main(String[] args) {

        System.out.println("Gestion d'un tableau");

        int[] nombres; // déclaration d'un tableau d'entiers
        int monNombre; // déclaration d'un entier

        nombres = new int[10]; // initialisation d'un tableau d'entier de 10 cases

        nombres[0] = 3; // affectation de la valeur 3 à la 1ère case du tableau
        nombres[nombres.length - 1] = 5; // affectation de la valeur 5 à la dernière case du tableau

        System.out.println(nombres[3]); // Affichage de la valeur de la 4ème case du tableau

        monNombre = nombres[3]; // récupération de la valeur de la 4ème case du tableau dans la variable toto

        System.out.println(monNombre); // Affichage de la valeur de la variable monNombre
        
        /* PARCOURIR UN TABLEAU */

        System.out.println("Parcours du tableau nombres[] du début à la fin");

        for(int i = 0; i < nombres.length; i++) {
            System.out.println(i + " = " + nombres[i]);
        }

        // EQUIVALENT du for précédent avec la boucle while
        int j = 0;

        while(j < nombres.length) {
            System.out.println(j + " = " + nombres[j]);
            j++;
        }

        System.out.println("Parcours du tableau nombres[] de la fin au début");

        for(int i = nombres.length -1; i > -1; i--) {
            System.out.println(i + " = " + nombres[i]);
        }
       
        System.out.println("Fin du programme");
    }
}
