import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DierRadenSpel();
    }
        public static void DierRadenSpel() {
            String[] dieren = {"kat", "hond", "vogel", "kip", "varken", "paard", "vis"};
            Random random = new Random();
            String geheimDier = dieren[random.nextInt(dieren.length)];

            System.out.println("Welkom bij het dier raden spel!");
            System.out.println("Ik denk aan een dier...");

            Scanner scanner = new Scanner(System.in);
            boolean geraden = false;
            int kansen = 6;

            while (!geraden && kansen > 0) {
                System.out.print("Raad welk dier ik denk aan (geef een gok in): ");
                String guess = scanner.nextLine().toLowerCase();

                if (guess.equals(geheimDier)) {
                    System.out.println("Goed geraden! Je hebt het dier geraden in " + (7 - kansen) + " gokken.");
                    geraden = true;
                } else {
                    System.out.println("Fout, probeer opnieuw.");
                    kansen--;
                }
            }

            if (!geraden) {
                System.out.println("Helaas, je hebt het dier niet geraden. Het dier was een " + geheimDier + ".");
            }
    }
}