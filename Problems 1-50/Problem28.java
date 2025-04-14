import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int fac = 1;
        for(int i = 0; i<num; i++) {
            fac *= num-i;
        }
        
        int number = fac , sum = 0;
        while(number>0) {
            int rem = number % 10;
            sum += rem;
            number /= 10;
        }
        System.out.println("Factorial is : "+fac+" and Sum of them is : "+sum);
    }
}
