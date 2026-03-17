import java.util.Scanner;

public class ArmstrongInterval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i <= high; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);
            num /= 10;
        }

        return sum == original;
    }
}