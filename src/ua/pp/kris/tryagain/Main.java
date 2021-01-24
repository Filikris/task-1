package ua.pp.kris.tryagain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(;;) {
            System.out.print("Enter the temperature in degrees Celsius: ");
            Double temp = in.nextDouble();
            in.nextLine();

            Double res = (temp * 1.8) + 32.0;
            System.out.println("It is the same in degrees Fahrenheit: " + res);

            System.out.println("Do you want try again? yes (y) /no (n)");
            String answer = in.nextLine();
            if(answer.equals("no") || answer.equals("n")) break;
        }
    }
}
