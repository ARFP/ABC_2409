import java.util.Scanner;

public class Exo38 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double prix = 1;
        double somme = 0;

        while (prix != 0) {
            System.out.println("Veuillez saisir un prix ou 0 pour terminer : ");
            prix = sc.nextDouble();
            somme = somme + prix;
            // += addition deux valeurs et stocke le résultat dans la variable (à gauche)
            // Donc on peut aussi ecrire somme += prix
        }

        System.out.println("Le client doit payer : " + Math.round(somme * 100.0) / 100.0);

        int nbBillet = 0;

        if (somme % 5 == 0) {
            nbBillet = (int) somme / 5;
        } else {
            nbBillet = (int) somme / 5 + 1;
        }

        int sommeBillet = nbBillet * 5; // somme des billets de 5 euros
        double rendu = sommeBillet - somme; // différence entre la somme des billet de 5euros et de la somme due
        double renduArrondi = Math.round(rendu * 100.0) / 100.0;

        System.out.println("Le client doit donner " + nbBillet + " billet(s) de 5 Euros soit " + sommeBillet + " Euros.");
        System.out.println("Rendu monnaie : " + renduArrondi + " Euros.");
        System.out.println("Répartition de la monnaie à restiuer au client : ");
        System.out.println();

        // tant que somme superieure à 2 on deduit 2 euros, on déduit 2 euros puis si
        // sup a 1 euro on déduit 1 euro ...

        double[] monnaie = { 2, 1, 0.5, 0.2, 0.1 };
        int piece = 0;

        

        for (int i = 0; i < monnaie.length; i++) {

            double monnaieCourante = monnaie[i];
            long a = Double.doubleToLongBits(renduArrondi);
            long b = Double.doubleToLongBits(monnaieCourante);
            int c = Double.compare(a, b);

                //while (renduArrondi >= monnaieCourante) {
                while(c >= 0) {
                    renduArrondi = Math.round(renduArrondi * 100.0) / 100.0 - monnaie[i];
                    piece = piece + 1;
                    a = Double.doubleToLongBits(renduArrondi);
                    c = Double.compare(a, b);

                }

        System.out.println(piece + " piece de " + monnaie[i] + " euros " );    
        piece = 0;
        }

        System.out.println();

        sc.close();

    }
}
