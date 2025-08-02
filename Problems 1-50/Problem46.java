import java.util.Scanner;

public class Problem46 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int count = 0;

       
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (Exception e) {
          
        }

        System.out.println("Length of the string: " + count);


    }
}
