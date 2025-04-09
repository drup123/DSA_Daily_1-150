import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int num = sc.nextInt();
        int temp = num, sum = 0;

        int length = String.valueOf(Math.abs(num)).length(); 

        while(temp>0) {
            int rem = temp % 10;
            sum += Math.pow(rem,length);
            temp /= 10;
        }
        
        if(num == sum) {
            System.out.println("The number "+num+" is Narcissistic Number");
        }
        else
        System.out.println("The number "+num+" is  not Narcissistic Number");
    }
}
