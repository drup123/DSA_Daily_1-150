import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values of array : ");
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int max=arr[0],min=arr[0];

        for(int i = 0; i<n ; i++){
            max = Math.max(max,arr[i]);
        }
        for(int i = 0; i<n ; i++){
            min = Math.min(min,arr[i]);
        }

        System.out.println("Maximum no. is : " +max+ " and Minimum is : " +min);


    }
}
