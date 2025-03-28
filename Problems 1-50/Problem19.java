import java.util.ArrayList;

public class Problem19 {

    public static boolean isPrime(int num) {
        if(num <= 1)
        return false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0)
            return false;
        }
        return true;
    }

    public static ArrayList<Integer> findPrime(int start, int end) {
        ArrayList<Integer> Prime = new ArrayList<>();

        for(int i = start; i <= end; i++) {
            if(isPrime(i))
            Prime.add(i);
        }
        return Prime;
    }

    public static void main(String[] args) {
        int start = 10 , end = 30;
        ArrayList<Integer> GetPrime = findPrime(start, end);

        System.out.println("Prime numbers in range [" + start + ", " + end + "]: " + GetPrime);

    }
}
