import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.print("Enter the numbers for the array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        // Bubble Sort Algorithm
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) { 
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }

    }
}
