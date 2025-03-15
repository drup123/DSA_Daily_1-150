import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Greater number : ");
        int a = input.nextInt();
        System.out.print("Enter Smaller number : ");
        int b = input.nextInt();

        int num1 = a, num2 = b;
        int rem = 0;
        while(num2>0) {
            rem = num1 % num2;
            num1=num2;
            num2=rem;
        }

       int LCM = (a*b)/num1;
       System.out.println("The LCM is "+LCM);

    }
}
