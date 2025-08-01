public class Problem42 {

    public static int Fibonacci(int n) {
        
        if(n<=1)
            return n;
        return Fibonacci(n-1) + Fibonacci(n-2);

        
    }

    public static void main(String[] args) {
        int num = 5;

        for(int i = 0; i < num; i++) {
            System.out.print(Fibonacci(i));
            if(i != num - 1)
            System.out.print(" ");
        }
    }
}
