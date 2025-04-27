import java.util.ArrayList;
import java.util.List;

public class Problem31 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // First base case
        if (numRows == 0) {
            return triangle;
        }

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        // Build the triangle row by row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); // First element is always 1

            // Middle elements
            for (int j = 1; j < i; j++) {
                int value = prevRow.get(j - 1) + prevRow.get(j);
                currentRow.add(value);
            }

            currentRow.add(1); // Last element is always 1

            triangle.add(currentRow);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5; 
        List<List<Integer>> pascal = generate(numRows);

        // Print the triangle
        for (List<Integer> row : pascal) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
