import java.util.Scanner;
import java.util.Arrays;
public class Problem30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter no of array : ");
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
        int value = 1;
        int index = 0;

        System.out.print("Missing values are : ");
        while(value <= n) {
            if(arr[index] == value) {
                index++;
            }
            else {
                System.out.print(value+" , ");
            }
            value++;
        }
    }
}
