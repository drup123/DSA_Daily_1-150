import java.util.ArrayList;
import java.util.List;

public class Problem35 {
    public static boolean isPrime(int num) {
        if(num<=1) {
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static ArrayList<Integer> getPrime(int start, int end) {
        ArrayList<Integer> prime = new ArrayList<>();

        for(int i = start; i <= end; i++) {
            if(isPrime(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        int start = 1 ,  end = 10;

        ArrayList<Integer> PrimeNUM = getPrime(start, end);
        
        int sum = 0;
        for(int i : PrimeNUM) {
            sum+=i;
        }
        
        System.out.println("Sum is " + sum);
    }
}
