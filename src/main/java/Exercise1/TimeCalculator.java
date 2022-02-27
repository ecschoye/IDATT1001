package Exercise1;

import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        int totSeconds = hours*3600 + minutes*60 + seconds;
        System.out.println(hours + " hours, " + minutes + " minutes " + " and " + " seconds is " + totSeconds + " total seconds.");
    }
}
