
import java.util.Random;
import java.util.Scanner;

class Game {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int userchoice = 0, itteration = 0;

        do {
            // Enter the number between 1-100//

            System.out.println("enter the number between 1-100");
            userchoice = sc.nextInt();

            // Right Guess//
            if (userchoice == number) {
                System.out.println("YOU GUESS THE RIGHT NUMBER");
                break;

                // number is large//
            } else if (userchoice > number) {
                System.out.println("YOUR NUMBER IS TOO LARGE");

                // number is Small//
            } else {
                System.out.println("YOUR NUMBER IS TOO SMALL");
                itteration++;
            }

        } while (userchoice > 0);
        System.out.println("THE GAME IS END " + itteration + " ITTERATIN ");

    }
}