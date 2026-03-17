import java.util.Scanner;

public class PrimeInterval {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int low = sc.nextInt();
        int high = sc.nextInt();

        while (low <= high) {
            if (isPrime(low)) {
                System.out.print(low + " ");
            }
            low++;
        }
    }

    
}