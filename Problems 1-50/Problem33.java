import java.util.Scanner;

public class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = sc.nextInt();
        System.out.print("Enter power that you want : ");
        int power = sc.nextInt();

        double result = Math.pow(num,power);
        System.out.println(result);
    }
}
