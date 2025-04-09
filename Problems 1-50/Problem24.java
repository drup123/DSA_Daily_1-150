import java.util.Scanner;

public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int limit = sc.nextInt();
        int num = 0;


        while (num<limit) {
            if(isPrime(num)) {
                System.out.print(num+" ");
            }

            num++;
        }
    }

    static boolean isPrime(int num) {
        if(num <= 1)
        return false;

        for(int i = 2; i<num; i++) {
            if(num % i == 0){
                return false;
            } 
        }
        return true;
    }
}
