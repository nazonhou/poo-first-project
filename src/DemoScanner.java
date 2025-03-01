import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        String currency = scanner.nextLine();

        System.out.println("Vous avez entré le montant " + amount + " avec la devise " + currency);
    }
}
