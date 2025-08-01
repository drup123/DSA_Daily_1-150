import java.util.Scanner;

public class Problem45 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        int count = 0, finalCount=0, frequentNumber = arr[0];

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(arr[i] == arr[j]) {
                    count ++;
                }
            }

            if(finalCount < count) {
                frequentNumber = arr[i];
            }

            count = 0;
        }

        System.out.println("Mode is "+frequentNumber);
    }
}
