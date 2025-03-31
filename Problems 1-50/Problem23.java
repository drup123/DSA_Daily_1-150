import java.util.Scanner;

public class Problem23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Position : ");
        int num = sc.nextInt();

        int first_el = 0,second_el = 1;
        System.out.print(first_el+" "+second_el);
        

        for(int i = 1; i<num; i++) {
            int temp = first_el + second_el;
            System.out.print(" " +temp);
            first_el = second_el;
            second_el = temp;

        }
    }
}
