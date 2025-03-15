import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Line : ");
        String input = sc.nextLine();

        String Adjust_input = input.toLowerCase();

        int V_Count = 0, C_Count = 0;

        for(int i = 0; i<=Adjust_input.length()-1; i++) {
           
            if(Adjust_input.charAt(i) == 'a') {
                V_Count ++;
            }
            else if(Adjust_input.charAt(i) == 'e') {
                V_Count ++;
            }
            else if(Adjust_input.charAt(i) == 'i') {
                V_Count ++;
            }
            else if(Adjust_input.charAt(i) == 'o') {
                V_Count ++;
            }
            else if(Adjust_input.charAt(i) == 'u') {
                V_Count ++;
            }
            else {
                C_Count++;
            }
        }
        
        System.out.println("In line "+input);
        System.out.println("Vowel "+V_Count+" : Consonants "+C_Count);
       
    }
}
