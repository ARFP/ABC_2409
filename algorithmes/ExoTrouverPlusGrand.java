public class ExoTrouverPlusGrand {

    public static void main(String[] args)
    {
        int[] valeurs;
        int nbLePlusgrand;
        int positionDuPlusGrand;

        nbLePlusgrand = Integer.MIN_VALUE;
        positionDuPlusGrand = 0;

        valeurs = new int[] { 3, 42, 7, 1, 12};

        for(int i = 0; i < valeurs.length; i++) {
            if(valeurs[i] > nbLePlusgrand) {
                nbLePlusgrand = valeurs[i];
                positionDuPlusGrand = i;
            }
        }

        System.out.println("Le plus grand est " + nbLePlusgrand +" a la position " + positionDuPlusGrand);
    }
}
