import java.util.Scanner;

public class Amusement_parks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] grid = new int[rows][cols];
        System.out.println("Enter the maze weights:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[rows][cols];

        dp[0][0] = Math.max(1, grid[0][0]);

        for (int j = 1; j < cols; j++) {
            dp[0][j] = Math.max(grid[0][j], dp[0][j-1]);
        }

        for (int i = 1; i < rows; i++) {
            dp[i][0] = Math.max(grid[i][0], dp[i-1][0]);
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Math.max(grid[i][j], Math.min(dp[i-1][j], dp[i][j-1]));
            }
        }

        System.out.println("Minimum possible exit weight: " + dp[rows-1][cols-1]);
    }
}