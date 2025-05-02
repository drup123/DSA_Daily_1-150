import java.util.Scanner;

public class Problem40 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int temp = num;

        while(temp >= 10) {
            int sum = 0;
            while(temp > 0) {
                int rem = temp % 10;
                sum += rem;
                temp /= 10;
            }
            temp = sum;
        }
        System.out.println(temp);
    }
}
