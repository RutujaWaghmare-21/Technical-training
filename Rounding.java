import java.util.Scanner;

public class Rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int n = sc.nextInt();

        System.out.format("%." + n + "f", num);
        sc.close();
    }
}