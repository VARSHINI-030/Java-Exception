
import java.util.Scanner;



      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        try {
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            System.out.println("Always gets Executed");
        }

    }
