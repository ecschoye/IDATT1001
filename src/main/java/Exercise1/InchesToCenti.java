package Exercise1;

import java.util.Scanner;

public class InchesToCenti {
    public static void main(String[] args) {
        float inch = 2.54F;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter centimeters: ");
        float centi = scanner.nextFloat()*inch;
        System.out.println("That is " + centi + " in centimeters");
    }
}
