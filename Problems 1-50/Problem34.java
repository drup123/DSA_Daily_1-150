import java.util.Arrays;
import java.util.Scanner;

public class Problem34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First word : ");
        String word1 = sc.nextLine();
        System.out.print("Enter Second word : ");
        String word2 = sc.nextLine();

        if(isAnagram(word1, word2)) {
            System.out.println("Word is Anagram");
        } else {
            System.out.println("Word is not Anagram");
        }
        
    }
    public static boolean isAnagram(String a, String b) {
        char[] sample1 = a.toCharArray();
        Arrays.sort(sample1);
        char[] sample2 = b.toCharArray();
        Arrays.sort(sample2);
        System.out.println(sample1);
        System.out.println(sample2);
        
        for(int i = 0; i<sample1.length; i++) {
            if(sample1[i] != sample2[i]) {
                return false;
            }
        }
        return true;
    }
}
