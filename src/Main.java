import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 10 grades min 0 max 20 ... :");
        int[] grades = new int[10];
        for (int i=0; i<10 ; i++){
            grades[i] = input.nextInt();}
        int max = grades[0];
        int min = grades[0];
        int sum = 0;
        for (int i=0; i<10; i++){
            sum += grades[i];
            if (grades[i] > max){
                max = grades[i];
            }
            if (grades[i] < min ){
                min = grades[i];
            }
        }
        System.out.println(" ");
        System.out.println("Average grade of lessons is " + sum/10);
        System.out.println("Max grade of lessons is " + max);
        System.out.println("Min grade of lessons is " + min);

    }}