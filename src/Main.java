import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int aleatoryNumber= new Random().nextInt(100);
        int answer=101;
        int tryes=0;
        System.out.println("Tente adiivinhar o numero aleatorio escolhido no intervalo entre 0 e 100");
        System.out.println("Voce tem 5 tentativas");
        for(tryes=1; tryes<6; tryes++){

            System.out.printf("%d° Tentativa: ",tryes);
            answer= read.nextInt();
            if(answer<aleatoryNumber){
                System.out.println("Este numero é menor");
            }else if(answer>aleatoryNumber) {
                System.out.println("Este numero é maior");
            }else{
                break;
            }
        }
        if(tryes>5){
            System.out.printf("Infelizmente vc não conseguiu. O numero era %d", aleatoryNumber);
        }else {
            System.out.println("Parabens!!!Vc acertou!!!");
        }
    }
}