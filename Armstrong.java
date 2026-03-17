import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n, sum = 0, digits = String.valueOf(n).length();

        while (n > 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }
        if (original == sum) { 
            System.out.println("Armstrong");
        } 
        else {
            System.out.println("Not a Armstrong");
        }

        sc.close();
    }
}

