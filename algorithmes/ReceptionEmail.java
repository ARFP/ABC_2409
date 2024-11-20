/*
[Réception d'un message électronique] 
 
Lorsqu’un email est réceptionné par un serveur de messagerie, 
quelques vérifications sont nécessaires avant que l’email soit transmis à son destinataire final.  
 
Il est indispensable de contrôler que l’adresse email du destinataire existe 
et que la boite de réception du destinataire dispose de suffisamment d’espace disponible. 
Une analyse antivirus est systématiquement faite sur les pièces jointes 
(le serveur n’accepte que les pièces jointes inférieures à 25Mo).  
 
Si toutes les contrôles sont satisfaisants, l’email est transmis au destinataire.  
 
Le destinataire a peut-être activé un message d’absence (réponse automatique). 
Si tel est le cas, celui-ci est transmis à l’expéditeur. 
 */
public class ReceptionEmail {

    public static void main(String[] args) {

        System.out.println("Réception d'un message électronique...");

        Boolean emailDestinataireOk;    // L'adresse email du destinataire existe (true) ou pas (false)
        Boolean espaceDisponibleOk;     // L'espace disponible est suffisant (true) ou pas (false)
        Boolean pieceJointe;            // Pièce jointe à l'email (true) ou pas (false)
        float taillePieceJointe;        // Taille de la piece jointe (en Mo)
        Boolean analyseAntivirusOk;     // L'analyse antivirus a accepté la pièce jointe (true) ou pas (false)
        Boolean messageAbsence;         // Le destinataire a activé un message d'absence (true) ou pas (false)
        Boolean emailAccepte;

        emailDestinataireOk = true;
        espaceDisponibleOk = true;
        pieceJointe = true;
        taillePieceJointe = 20;
        analyseAntivirusOk = true;
        messageAbsence = true;

        
        // traitement a coder


        if(emailAccepte) {
            System.out.println("Le message a été délivré au destinataire.");
        } else {
            System.out.println("Le message n'a pas été délivré au destinataire.");
        }







    }

}
