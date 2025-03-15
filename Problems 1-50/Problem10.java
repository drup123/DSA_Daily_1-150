import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Greater number : ");
        int a = input.nextInt();
        System.out.print("Enter Smaller number : ");
        int b = input.nextInt();

        int rem = 0;
        while(b>0) {
            rem = a % b;
            a=b;
            b=rem;
        }

        System.out.println("The GCD is " +a);

    }
}
