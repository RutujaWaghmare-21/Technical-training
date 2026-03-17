import java.util.Scanner;

public class MaxRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // M = Days (Rows), N = Products (Columns)
        int M = sc.nextInt();
        int N = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int maxDayRevenue = Integer.MIN_VALUE;

            for (int j = 0; j < N; j++) {
                int currentProductRevenue = sc.nextInt();
                if (currentProductRevenue > maxDayRevenue) {
                    maxDayRevenue = currentProductRevenue;
                }
            }
            System.out.print(maxDayRevenue + " ");
            sc.close();
        }
    }
}