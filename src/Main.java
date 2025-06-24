import java.util.Random;
import java.util.Scanner;


public class Main {
    public static boolean IsValid(int number){
        return number>=0 && number<=100;
    }

    public static boolean WishContinue(int answer){
        return answer==1;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random randomNumberGenerator= new Random();
        int tries, answer, randomInt;
        do {
            tries=1;
            randomInt = randomNumberGenerator.nextInt(101);
            System.out.println("Try to guess the random integer number between 0 and 100");
            System.out.println("You have 5 attempts");

            do {
                System.out.printf("Attempt %d°: ", tries);
                answer = read.nextInt();
                if (IsValid(answer)) {
                    if (answer < randomInt) {
                        System.out.println("The number is higher");
                    } else if (answer > randomInt) {
                        System.out.println("The number is lower");
                    }
                    tries++;
                } else {
                    System.out.println("Enter a valid number, please");
                }
            } while (tries <= 5 && answer != randomInt);

            if (tries > 5) {
                System.out.printf("Unfortunately, you didn't guess it. The number was %d.", randomInt);
            } else {
                System.out.println("Congratulations! You guessed it!");
            }
            System.out.println("Do you want to keep playing? Enter '1' for yes");
            answer=read.nextInt();
        }while (WishContinue(answer));

        read.close();
    }
}