import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any String : ");
        String name = input.nextLine();
        
        StringBuilder NewString = new StringBuilder("");

        for(int i = name.length()-1; i >= 0 ; i--) {
            NewString.append(name.charAt(i));
        }
        
        if(name.equals(NewString.toString())) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Given String is not Palindrome");
        }

        
    }
}
