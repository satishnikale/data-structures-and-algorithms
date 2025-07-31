import java.util.ArrayList;

public class SpiralMatrix {
    public static ArrayList<Integer> printSpiral(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length - 1;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int i = startCol; i <= endCol; i++) {
                ans.add(mat[startRow][i]);
            }

            // Right column
            for (int j = startRow + 1; j <= endRow; j++) {
                ans.add(mat[j][endCol]);
            }

            // Bottom row (check if not the same as top row)
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    ans.add(mat[endRow][i]);
                }
            }

            // Left column (check if not the same as right column)
            if (startCol < endCol) {
                for (int j = endRow - 1; j > startRow; j--) {
                    ans.add(mat[j][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(mat);
    }
}
