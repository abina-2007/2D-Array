import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] accounts = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                accounts[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int c = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                c += accounts[i][j];
            }
            if (c > max) {
                max = c;
            }
        }
        System.out.println(max);
    }
}
