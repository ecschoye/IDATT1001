package Exercise4.Task1;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        double currency;
        double nok;
        CurrencyCalculator currencyCalculator = new CurrencyCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Dollar\n2. Euro\n3. Swedish kroner\n4. Close software");
        System.out.print("Enter menu choice:");
        int menuChoice = scanner.nextInt();


        switch (menuChoice){
            case 1:
                System.out.print("Enter amount of money: ");
                currency = scanner.nextDouble();
                nok = currencyCalculator.dollarCalculator(currency);
                System.out.println(currency + " USD is " + nok + " NOK");
                break;
            case 2:
                System.out.print("Enter amount of money: ");
                currency = scanner.nextDouble();
                nok = currencyCalculator.euroCalculator(currency);
                System.out.println(currency + " Euro is " + nok + " NOK");
                break;
            case 3:
                System.out.print("Enter amount of money: ");
                currency = scanner.nextDouble();
                nok = currencyCalculator.sekCalculator(currency);
                System.out.println(currency + " SEK is " + nok + " NOK");
                break;
            case 4:
                System.exit(0);
                break;

        }
    }
}
