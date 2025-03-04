import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        int temp = num , count = 0;

        while(temp > 0){
            temp = temp / 10;
            count ++;
        }
        
        int sum = 0 , temp1 = 0;
        temp = num;
        while(temp > 0) {
            temp1 = temp % 10;
            sum += Math.pow(temp1,count);
            temp = temp / 10;

        }
        
        if(num == sum) {
            System.out.println("Number is Armstrong");
        }
        else {
            System.out.println("Number is Not Armstrong");
        }


    }
}
