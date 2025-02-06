public class Vol {


    private int id;
    private String destination;
    private double tarif;
    private int nbPlaceTotale;
    private int nbPlaceOccupee;

    public Vol(){

        this.nbPlaceTotale = 80;
    }

    public Vol(int id,String destination,double tarif,int nbPlaceTotale,int nbPlaceOccupee){


        this.id = id;

        this.destination = destination;


        if(nbPlaceTotale < 80){

            this.nbPlaceTotale = 80;
        }else{

            
            this.nbPlaceTotale = nbPlaceTotale;
        }

        this.tarif = tarif;
        
        this.nbPlaceTotale = nbPlaceTotale;
                
        this.nbPlaceOccupee = nbPlaceOccupee;

    }

    public String toString(){

        String line ="\nid du Vol : "+this.id+"\n";
        line +="\nDestination : "+this.destination+"\n";
        line +="\nTarif : "+this.tarif+" euros\n";
        line +="\nnbPlaceTotale : "+this.nbPlaceTotale+"\n";
        line +="\nnbPlaceOccupee : "+this.nbPlaceOccupee+"\n";

        return line;
    }

    public int getNbPlaceTotale(){

        return this.nbPlaceTotale; 
    }

    public int getNbPlaceOccupee(){

        return this.nbPlaceOccupee; 

    }

    public double getId(){

        return this.id; 

    }


    public String getDestination(){

        return this.destination; 

    }

    

    public double getTarif(){

        return this.tarif; 

    }

}
