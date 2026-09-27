public class twoD {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int element = matrix[1][2]; 
        System.out.println("Element at row 1, col 2: " + element);
        System.out.println();
        System.out.println("--- Entire Matrix ---");
        for (int i = 0; i < matrix.length; i++) { 
            for (int j = 0; j < matrix[i].length; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
