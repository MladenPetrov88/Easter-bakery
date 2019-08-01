import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPriceKG = Double.parseDouble(scanner.nextLine());
        double flourKGS = Double.parseDouble(scanner.nextLine());
        double sugarKGS = Double.parseDouble(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int maya = Integer.parseInt(scanner.nextLine());

        double sugarPrice = flourPriceKG * 0.75;
        double eggsPrice = flourPriceKG * 1.1;
        double mayaPrice = sugarPrice * 0.2;

        double flourPrice = flourPriceKG * flourKGS;
        double sugarPriceTotal = sugarPrice * sugarKGS;
        double eggsTotalPrice = eggsPrice * eggs;
        double mayaTotalPrice = maya * mayaPrice;
        double totalPrice = flourPrice + sugarPriceTotal + eggsTotalPrice + mayaTotalPrice;
        System.out.printf("%.2f", totalPrice);
    }
}
