public class Main1 {
    static int check = 0;

    public static void main(String[] args) {
        int[][] sudoku = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 0, 6, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        fill(sudoku, 0, 0);

        if (check == 1) {
            System.out.println("Solved Sudoku:");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution found!");
        }
    }

    private static void fill(int[][] sudoku, int crow, int ccol) {
        if (crow == 9) {
            check = 1;
            return;
        }

        if (sudoku[crow][ccol] != 0) {
            if (ccol < 8)
                fill(sudoku, crow, ccol + 1);
            else
                fill(sudoku, crow + 1, 0);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isValid(sudoku, crow, ccol, i)) {
                    sudoku[crow][ccol] = i;

                    if (ccol < 8)
                        fill(sudoku, crow, ccol + 1);
                    else
                        fill(sudoku, crow + 1, 0);

                    if (check == 1) return;

                    sudoku[crow][ccol] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] sudoku, int crow, int ccol, int num) {
        for (int i = 0; i < 9; i++)
            if (sudoku[crow][i] == num || sudoku[i][ccol] == num)
                return false;

        int srow = (crow / 3) * 3;
        int scol = (ccol / 3) * 3;

        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (sudoku[i][j] == num)
                    return false;
            }
        }

        return true;
    }
}