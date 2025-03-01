import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean toContinue = true;

        while (toContinue) {
            System.out.println("Veuillez entrer le montant en XOF que vous souhaitez convertir");

            double amount = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Donc vous souhaitez convertir " + amount + " XOF");
            System.out.println("Veuillez entrer la devise d'arrivée.");
            System.out.println("    Valeurs valides : EUR, USD");

            String currency = scanner.nextLine();

            double amountConverted;

            switch (currency) {
                case "EUR":
                    amountConverted = amount / 655;
                    System.out.println("Le montant converti est : €" + amountConverted);
                    break;
                case "USD":
                    amountConverted = amount / 450;
                    System.out.println("Le montant converti est : " + amountConverted + "$");
                    break;
                default:
                    System.out.println("Vous avez entré une devise erronée");
                    break;
            }


            System.out.println("Voulez vous continuer ? [y/n]");
            String userWantToContinue = scanner.nextLine();

            if (userWantToContinue.equals("n")) {
                toContinue = false;
            }
        }

        scanner.close();
    }
}
