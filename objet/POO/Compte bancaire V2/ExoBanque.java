// Déclaration de la classe CompteBancaire

import java.util.List;

public class ExoBanque {



    // Définition des attributs de la classe CompteBancaire
    private int nbComptes;
    private List<ExoCompteBancaireV2> mesComptes;
    private String nom;
    private String ville;



    public ExoBanque(){



    }


    public ExoBanque(int nbComptes, List<ExoCompteBancaireV2> mesComptes, String nom,String ville ) {
        
        /* Initailisation des attributs */

        this.nbComptes = nbComptes;
        this.mesComptes = mesComptes;
        this.nom = nom;
        this.ville = ville;


    }

    public ExoBanque( ExoBanque compteClone ) {

        nbComptes = compteClone.nbComptes;
        mesComptes = compteClone.mesComptes;
        nom = compteClone.nom;
        ville = compteClone.ville;

    }


    public String toString() {


        String result="";

        for(ExoCompteBancaireV2 compte : mesComptes){  /* Utiliser un For each pour parcour toute la liste */

            result += "\n"+compte.toString();

        }

        return result;

    }




    public void ajouterCompte(int id, String owner, double balance,double overdraft){

        ExoCompteBancaireV2 ajoutCompte = new ExoCompteBancaireV2(id,owner,balance,overdraft);

        this.mesComptes.add(ajoutCompte);

    }

    public void ajouterCompte(ExoCompteBancaireV2 ajoutCompte){

        this.mesComptes.add(ajoutCompte);

    }

    public ExoCompteBancaireV2 compteSup() {

        /*  
        
        Objectif : récupérer successivement et dynamiquement le solde de chaque compte 
        en partant du début de la liste. Puis vérifier à chaque cellule du tableau, qu'elle est la valeur la plus grande
        
        */

        ExoCompteBancaireV2 maxAccount = mesComptes.get(0);

        for(ExoCompteBancaireV2 compte : mesComptes){

            if(maxAccount.getBalance() <= compte.getBalance()){

                maxAccount = compte;

            }

        }

        return maxAccount;

    }

        public ExoCompteBancaireV2 rendCompte(int idCompte){


            ExoCompteBancaireV2 result = null;

            for(ExoCompteBancaireV2 compte : mesComptes){

                if(idCompte == compte.getId() ){
    
                    result = compte;
    
                }
    
            }

            return result;

        }

        public boolean transfer(ExoCompteBancaireV2 envoyeur,ExoCompteBancaireV2 beneficiary, double amountToTransfer) {

                return envoyeur.transfer(beneficiary,amountToTransfer);
                
        }
    




}