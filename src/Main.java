import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first side of the triangle - integer... :");
        int W = input.nextInt();
        System.out.println("Enter the second side of the triangle - integer... :");
        int L = input.nextInt();
        int H = (int)Math.pow(W,2) + (int)Math.pow(L,2);
        System.out.println("Missing side of triangle is " + (Math.sqrt(H)));
    }}