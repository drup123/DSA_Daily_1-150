import java.util.HashSet;
import java.util.Scanner;

public class Problem50 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = s.nextLine();

        int start = 0, end = 0;
        int maxLength = 0;
        int maxStart = 0;

        HashSet<Character> set = new HashSet<>();

        while (end < input.length()) {
            char ch = input.charAt(end);
            if (!set.contains(ch)) {
                set.add(ch);
                end++;
                if (end - start > maxLength) {
                    maxLength = end - start;
                    maxStart = start;
                }
            } else {
                set.remove(input.charAt(start));
                start++;
            }
        }

        String result = input.substring(maxStart, maxStart + maxLength);
        System.out.println("Longest substring without repeating characters: " + result);
    }   
}
