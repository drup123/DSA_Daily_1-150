import java.util.Arrays;
import java.util.Scanner;

public class Problem49 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Size of array : ");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements : ");
        for(int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);

        int secondMax = arr[0];

        for(int i = 0; i < size; i++) {
            if(secondMax < arr[i]) {
                secondMax = arr[i-1];
            }
        }

        System.out.println("Second Large element is "+secondMax);
    }
}
