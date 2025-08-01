import java.util.Scanner;

public class Problem44 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }

        int avg = sum / size;

        System.out.println("Average of numbers in array : " + avg);

    }
}
