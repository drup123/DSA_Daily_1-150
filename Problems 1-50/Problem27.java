import java.util.Scanner;

public class Problem27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row : ");
        int row = sc.nextInt();

        int num = 1;

        for(int i = 1; i<=row; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}