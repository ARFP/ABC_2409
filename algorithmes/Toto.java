public class Toto {
    public static void main(String[] args) {

        System.out.println("\n Programme : réception de message électronique");

        double piecejointe = 23; // taille en Mo de la pièce jointe. Elle ne doit pas dépasser les 25 Mo.
        int antivirus = 1; // 1 si l'antivirus a jugé la pièce jointe conforme, 0 s'il elle a été
                           // jugée dangereuse
        int adresse = 1; // 1 si l'adresse existe, 0 si elle est introuvable
        int espace = 0; // 1 si le distinataire a assez d'espace dans sa boîte mail, 0 si ce
                        // n'est pas le cas

        if (piecejointe <= 25) {

            if (antivirus == 1) {

                if (adresse == 1) {

                    if (espace == 1) {

                        System.out
                                .println("Votre Email a été envoyé");
                        System.out.println(
                                "Réponse automatique : Bonjour, je suis absent du 18/11/2024 au 24/11/2024, je répondrais à votre mail une fois de retour. Merci.");

                    } else if (espace == 0) {
                        System.out
                                .println("Votre Email a été envoyé");
                        System.out.println(
                                "UNDELIVERED MAIL SYSTEM : Votre destinataire n'a pu recevoir votre mail car sa boîte de réception ne dispose plus d'assez d'espace pour le recevoir.(Ceci est un message automatique, inutile d'y répondre)");
                    }
                } else if (adresse == 0) {

                    System.out
                            .println("Votre Email a été envoyé");
                    System.out
                            .println(
                                    "UNDELIVERED MAIL SYSTEM : votre Email n'a pu aboutir car l'adresse de votre destinataire est introuvable.(Ceci est un message automatique, inutile d'y répondre)");
                }

            } else if (antivirus == 0) {
                System.out.println(
                        "Votre Email ne peut être envoyé car l'antivirus de laposte a analysé la pièce jointe comme étant dangereuse.");
            }

        } else if (piecejointe > 25) {
            System.out.println("Votre Email ne peut être envoyé car la pièce jointe excède 25 Mo.");
        }

    }
}
