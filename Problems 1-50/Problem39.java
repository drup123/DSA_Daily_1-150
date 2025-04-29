import java.util.Scanner;

public class Problem39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number : ");
        int num = sc.nextInt();
        int counter = 1;

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
