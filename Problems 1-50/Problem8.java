import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = input.nextInt();

        int fac = 1;

        for(int i = 1; i <= num ; i++) {
            fac *= i;
        }

        System.out.println("Factorial of " + num + " is " + fac);

    }
}
