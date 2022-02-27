package Exercise1;

import java.util.Scanner;

public class SecondsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter seconds: ");
        int totSeconds = scanner.nextInt();
        int hours = (int)Math.floor(totSeconds/3600);
        int minutes = (totSeconds/60) % 60;
        int seconds = totSeconds % 60;
        System.out.println(totSeconds + " total seconds is "+  hours + " hours, " + minutes + " minutes " + seconds + " seconds");
    }
}
