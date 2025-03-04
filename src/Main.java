import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer votre nom complet");
        String name = scanner.nextLine();

        double maths = 0.0;
        double physics = 0.0;
        double french = 0.0;

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Veuillez entrer votre note de mathématiques");
                    maths = scanner.nextDouble();
                    break;
                case 1:
                    System.out.println("Veuillez entrer votre note de physiques");
                    physics = scanner.nextDouble();
                    break;
                case 2:
                    System.out.println("Veuillez entrer votre note de français");
                    french = scanner.nextDouble();
                    break;
            }
        }

        double mean = (
                (maths * 3) + (physics * 3) + (french * 2)
        ) / (3 + 3 + 2);

        System.out.println("M/Mme " + name + ", vous avez obtenu " + mean + " de moyenne générale");

        if (mean >= 12.0) {
            System.out.println("Félicitations, vous passez en classe supérieure");
        } else {
            System.out.println("Désolé, la prochaine année sera la bonne");
        }

        scanner.close();
    }
}
