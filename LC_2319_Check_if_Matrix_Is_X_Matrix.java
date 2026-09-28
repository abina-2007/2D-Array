import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        boolean result = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    if (grid[i][j] == 0) {
                        result = false;
                        break;
                    }
                } else {
                    if (grid[i][j] != 0) {
                        result = false;
                        break;
                    }
                }
            }
            if (!result) {
                break;
            }
        }
        System.out.println(result);
    }
}
