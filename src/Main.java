import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "garonis";
        String password = "123abc!@#";
        System.out.println("Enter username:");
        String usernamein = input.nextLine();
        System.out.println("Enter password:");
        String passwordin = input.nextLine();
        if (usernamein.equals(username) && (passwordin.equals(password))){
            System.out.println("Access Completed");}
        else {
            System.out.println("Access Denied");
        }
    }}