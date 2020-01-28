
import java.util.Scanner;

public class TenInputs {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int[] randint = new int[10];
        int sum = 0;
        for (int i = 0; i < randint.length; i++) {
            System.out.println("Please enter your next number out of 10: ");
            randint[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int num : randint) {
            sum = sum + num;
        }

        System.out.println("The sum of the array is: " + sum);
    }
}