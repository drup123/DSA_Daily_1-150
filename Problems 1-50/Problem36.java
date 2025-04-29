import java.util.Scanner;

public class Problem36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int T_num = (n*(n+1))/2;

        System.out.println(n + "th Traingular Number is " + T_num);
    }
}
