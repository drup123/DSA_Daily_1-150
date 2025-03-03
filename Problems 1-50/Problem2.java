import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

       if(isPrime(num)) {
        System.out.println("The Number is Prime");
       } 
       else {
        System.out.println("The Number is Not Prime");
       }

    }
    static boolean isPrime(int num) {
        if(num <= 1)
        return false;
        for (int i = 2; i < num; i++) { 
            if (num % i == 0) 
            return false; 
        }
        return true;
    }
}
