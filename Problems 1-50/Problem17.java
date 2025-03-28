import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem17 {
       // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = 0;
        
        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            digits++;
        }
        
        // Calculate the sum of digits raised to the power of the number of digits
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == originalNum;
    }
    
    // Function to find all Armstrong numbers in a given range
    public static List<Integer> findArmstrongNumbers(int start, int end) {
        List<Integer> armstrongNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                armstrongNumbers.add(i);
            }
        }
        return armstrongNumbers;
    }
    
    public static void main(String[] args) {
        int start = 1, end = 500;
        List<Integer> armstrongNumbers = findArmstrongNumbers(start, end);
        
        // Print the Armstrong numbers
        System.out.println("Armstrong numbers in range [" + start + ", " + end + "]: " + armstrongNumbers);
    }
}
