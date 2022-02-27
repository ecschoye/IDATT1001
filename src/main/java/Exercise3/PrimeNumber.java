package Exercise3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        boolean isPrimeNumber = true;

        if (number == 0 || number == 1){
            isPrimeNumber = false;
        }else {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0){
                    isPrimeNumber = false;
                    break;
                }
            }
        }

            if (isPrimeNumber){
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }
        }

}
