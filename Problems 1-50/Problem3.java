import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int num = input.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {  
            System.out.println("This is a Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
        
    }
}
