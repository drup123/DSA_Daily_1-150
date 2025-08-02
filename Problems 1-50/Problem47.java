public class Problem47 {
    public static void main(String[] args) {
        int row = 4, count = 1;

        for(int i = 0; i < row; i++) {
            System.out.print(count);
            for(int j = 0; j < i; j++) {
                count++;
                System.out.print(" "+count);
            }
            count = 1;
            System.out.println();
        }
    }
}
