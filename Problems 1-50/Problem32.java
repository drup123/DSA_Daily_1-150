import java.util.Scanner;
import java.util.Arrays;
public class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter Elements of array : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       Arrays.sort(arr);
       
       if(n % 2 != 0) {
            int rem = n % 2;
            int ans = n / 2;
            int med_index = rem + ans;
            int median = arr[med_index-1];
            System.out.println("Median is "+median);
        } else {
            int ans = n / 2;
            int ele1 = arr[ans-1];
            int ele2 = arr[ans];
            float median = (ele1+ele2) / 2f;
            System.out.println("Median is "+median);
        }
        
       

    }
}
