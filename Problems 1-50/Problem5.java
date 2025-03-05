
public class Problem5 {
    public static void main(String[] args) {
        int next = 0; 
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: "+ first + " "+ second);
        for(int i = 0; i < 5; i++) {
            next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
