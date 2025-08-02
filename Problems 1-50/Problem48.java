import java.util.Scanner;

public class Problem48 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        int sum = 0;

        for (int i = 2; i <= num; i++) {
            if (isPrime(i) && num % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of Prime Factor " + sum);
    }
}
