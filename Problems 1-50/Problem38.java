import java.util.Scanner;

public class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();

        int sum = 0 , temp = num;

        while(temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, 2);
            temp /= 10;
        }

        System.out.println("Sum of Squares of " + num + " is " + sum);

    }
}
