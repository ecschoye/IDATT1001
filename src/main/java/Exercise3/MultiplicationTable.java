package Exercise3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number");
        int multiplicationTableStart = scanner.nextInt();
        System.out.println("Enter last number");
        int multiplicationTableEnd = scanner.nextInt();
        for (int i = multiplicationTableStart; i <= multiplicationTableEnd ; i++) {
            for (int j = 1; j <= 10 ; j++) {
                System.out.println( i + " x " + j + " = " + i*j );
            }
        }
    }
}
