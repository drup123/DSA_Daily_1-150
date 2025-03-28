import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Problem20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the any number : ");
        int number = sc.nextInt();

        ArrayList<Integer> perfect = new ArrayList<>();

        for(int i = 1; i < number; i++) {
            if(number%i == 0) 
            perfect.add(i);
        }

      
        int sum = perfect.stream().mapToInt(Integer::intValue).sum();


        if(sum == number) 
        System.out.println("Number is Perfect");
        else
        System.out.println("Number is not Perfect");


    }
}
