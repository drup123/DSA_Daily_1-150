import java.util.Scanner;

public class Problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        int numbers = sc.nextInt();
        System.out.print("Enter number that you want to find : ");
        char num = sc.next().charAt(0);
        int count = 0;

        String str = Integer.toString(numbers);

        char[] arr = str.toCharArray();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        System.out.println(count);


    }
}
