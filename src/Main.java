import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int randomInt= new Random().nextInt(100);
        int answer=101;
        int tryes=0;
        System.out.println("Try to guess the random integer number between 0 and 100");
        System.out.println("You have 5 attempts");
        for(tryes=1; tryes<6; tryes++){

            System.out.printf("Attempt %d°: ",tryes);
            answer= read.nextInt();
            if(answer<randomInt){
                System.out.println("The number is higher");
            }else if(answer>randomInt) {
                System.out.println("The number is lower");
            }else{
                break;
            }
        }
        if(tryes>5){
            System.out.printf("Unfortunately, you didn't guess it. The number was %d.", randomInt);
        }else {
            System.out.println("Congratulations! You guessed it!");
        }
    }
}