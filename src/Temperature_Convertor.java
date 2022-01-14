import java.util.Scanner;

public class Temperature_Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Converting Fehranheit to Celsius.");
        System.out.println("Enter 2 for Converting Celsius to Fehranheit.");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter the Temperature in Fehranheit: ");
                int Fehranheit = sc.nextInt();
                System.out.println("");
                System.out.println("The Temperature in Celsius: " + (Fehranheit - 32) * 5 / 9);
                break;

            case 2:
                System.out.print("Enter the Temperature in Celsius: ");
                int celsius = sc.nextInt();
                System.out.println("");
                System.out.println("The Temperature in Fehranheit: " + (celsius * 9 / 5) + 32);
                break;
        }
    }

}
