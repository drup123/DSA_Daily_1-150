import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = input.nextLine();

        String New_string = new StringBuilder(word).reverse().toString();
        System.out.println(New_string);
    }
}
