import java.util.Scanner;
public class Power_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        double power = Math.pow(a, b);
        System.out.println(power);
    }
}
