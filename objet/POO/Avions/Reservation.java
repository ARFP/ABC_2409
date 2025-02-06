
import java.util.ArrayList;

public class Reservation {


    private String nom;
    private String prenom;
    private int age;
    private double prixFinale;
    private boolean business;
    private int numeroVol;
    private String destination;

    public Reservation(){

        this.prixFinale = 0;
        this.business = false;

    }

    public Reservation(String nom,String prenom, int age,boolean business,int numeroVol,String destination){

        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.prixFinale = 0;
        this.business = business;
        this.numeroVol = numeroVol;
        this.destination = destination;


    }

    public boolean estCeComplet(Vol vol){

        return vol.getNbPlaceTotale() == vol.getNbPlaceOccupee();
    }

    public void reductionAge(Vol vol){


        double coeff;

        if(this.age > 65){

            coeff = 0.05;


        }else{

            coeff = 0.1;

        }

        try {

            double reduc = vol.getTarif()/(this.age*coeff);

            if(reduc > 600.00){
    
                reduc = 600.00;
            }
    
            this.prixFinale -= reduc;
            
        } catch (Exception e) {

            System.out.println("Erreur Votre âge est inconnu ou égale à 0, la réduction ne pourra se faire sur votre âge");
        }



    }

    public void changePrixPlace(Vol vol){


        int percentCapacite = (vol.getNbPlaceOccupee() * 100) / vol.getNbPlaceTotale();

     if(percentCapacite<=20){

        this.prixFinale *=  0.8;

     }

     if(percentCapacite>=80){

        this.prixFinale *=  1.2;
        
     }



    }

    public void augmentationBusiness(){


        if(this.business == true){

            this.prixFinale *=  1.70;
        }


    }

    public void minimumPrixFinale(){

        if (this.prixFinale < 500){

            this.prixFinale = 500;

        }

    }

    public Vol choisirUnvolParId(ArrayList<Vol> vols){


        Vol volchoisi = null;

        for(Vol vol : vols){

           if(vol.getId() == this.numeroVol){

            volchoisi = vol;

           }

        }

        return volchoisi;


    }



    public Vol choisirUnvolParDestination(ArrayList<Vol> vols){


        Vol volchoisi = null;

        for(Vol vol : vols){

           if(vol.getDestination().equals(this.destination)){

            volchoisi = vol;

           }

        }

        return volchoisi;

    }


    public double prixFinale(Vol vol){

        this.prixFinale = vol.getTarif();
        reductionAge(vol);
        changePrixPlace(vol);
        augmentationBusiness();
        minimumPrixFinale();

        return this.prixFinale;


    }



}
