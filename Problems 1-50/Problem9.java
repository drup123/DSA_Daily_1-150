import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();
        int sum = 0 , temp = num , count = 0;

        while(temp>0) {
            temp = temp / 10;
            count++;
        }

        int rem = 0;
        for(int i = 0; i <= count; i++) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }

        System.out.println("The sum of numbers is " + sum);
    }
}
