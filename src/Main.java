import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random random= new Random();
        int machine = random.nextInt(2);
        System.out.println("Enter petra 0 - molivi 1 - charti 2 :");
        int userin = input.nextInt();
        if (machine == userin){
            System.out.println("Its a draw!!! ");
        }else if (machine == 0 && userin == 1 ){
            System.out.println("Machine wins!");
        }else if (machine == 0 && userin == 2){
            System.out.println("Player wins!!!");
        }else if (machine == 1 && userin == 0){
            System.out.println("Player wins!!!");
        }else if (machine == 1 && userin == 2){
            System.out.println("Machine wins!!!");
        }else if (machine == 2 && userin == 0){
            System.out.println("Machine wins!!!");
        }else{
            System.out.println("Player wins!!!");
        }
    }}

