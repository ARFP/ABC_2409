
import java.util.ArrayList;
import java.util.Scanner;

public class VolMain {


    public static String toutLesVols(ArrayList<Vol> vols){

        String message ="";

        for(Vol vol : vols){

            message +="\n\n"+vol.toString()+"\n\n";
        }

        return message;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Vol> vols = new ArrayList<>();

        vols.add(new Vol(244,"New York",1000.00,210,89));
        vols.add(new Vol(365,"Johannesburg",1200.25,180,50));
        vols.add(new Vol(777,"Tokyo",1500.50,200,190));
        vols.add(new Vol(123,"Rio de Janeiro",1300.75,210,210));
        vols.add(new Vol(457,"Istanbul",900,210,3));


        /* Afficher la liste des vols */

        System.out.println(toutLesVols(vols));

        Reservation resa = new Reservation("Konda","Eudes",50,true,123,"Tokyo");

        Vol monvol = resa.choisirUnvolParId(vols);

        if(monvol == null){

            monvol = resa.choisirUnvolParDestination(vols);
        }

        System.out.println("Mon vol choisit par ID :"+resa.choisirUnvolParId(vols));

        System.out.println("Mon vol choisit par Destination :"+resa.choisirUnvolParDestination(vols));

        System.out.println("Mon vol est - il complet ? :"+resa.estCeComplet(monvol));

        if(resa.estCeComplet(monvol)==false){
            System.out.println("Prix total :"+resa.prixFinale(monvol));
        }


            scanner.close();
        
    }
}
