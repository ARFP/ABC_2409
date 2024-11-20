/*
Exercice 4.2 : Créer un tableau de chaines de caractères
Écrire un algorithme qui déclare 
et remplit un tableau contenant les six voyelles de l’alphabet latin. */
public class Exo42 {

    public static void main(String[] args)
    {
        String[] voyelles;

        voyelles = new String[] { "A", "E", "I", "O", "U", "Y" };

        voyelles = new String[6];
        voyelles[0] = "A";
        voyelles[1] = "E";
        voyelles[2] = "I";
        voyelles[3] = "O";
        voyelles[4] = "U";
        voyelles[5] = "Y";

        System.out.println("Dernière cellule: " + voyelles[voyelles.length - 1]);

       for(int i = 0; i < voyelles.length; i++) {
            System.out.println(i + " = " + voyelles[i]);
            /*voyelles[i] = voyelles[i] + 2;
            voyelles[i] += 2;*/
        }

        for(int i = 0; i < voyelles.length; i++) {
            System.out.println(voyelles[i]);
        }

        for(String lettre : voyelles ) {
            System.out.println(lettre);
        }

        int j = 0;

        while(j < voyelles.length) {
            System.out.println(voyelles[j]);
            j++;
        }

        int k = 0;

        do {
            System.out.println(voyelles[k]);
            k++;
        } while(k < voyelles.length);


        /*for(int i = 1; i < voyelles.length + 1; i++) {
            System.out.println(i + " = " + voyelles[voyelles.length - i]);
        }*/

       /*  for(int i = voyelles.length - 1; i > -1; i--) {
            System.out.println(i + " = " + voyelles[i]);
        }*/








    }
}
