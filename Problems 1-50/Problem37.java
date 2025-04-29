import java.util.Scanner;

public class Problem37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();

        double sqr = Math.sqrt(num);
        int val = (int)sqr;

        if(sqr == val) {
            System.out.println(num + " is a Perfect Square");
        } else {
            System.out.println(num + " is not a Perfect Square");
        }
    }
}
