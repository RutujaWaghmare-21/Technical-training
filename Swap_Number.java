import java.util.Scanner;
public class Swap_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        System.out.println("A is:"+a+"  "+"B is :"+b);
        c=a;
        b=a;
        a=c;
        System.out.println("After Swaping");
        System.out.println("A is:"+a+"  "+"B is :"+b);
        sc.close();
    }
}
