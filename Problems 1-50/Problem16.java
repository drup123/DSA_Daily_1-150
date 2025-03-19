import java.util.Scanner;

public class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the numbers for the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i<size; i++) {
             sum += array[i];
        }

        System.out.println("The sum is : "+sum);
    }
}
