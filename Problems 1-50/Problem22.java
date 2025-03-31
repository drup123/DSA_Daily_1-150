public class Problem22 {
    public static void main(String[] args) {
        int temp = 0;
        for(int i = 1; i<=10; i++) {
            if(i % 2 != 0)
            temp += i;
        }
        System.out.println("sum of odd numbers in rage 1 to 10 is "+temp);
    }
}
