import java.util.Scanner;
public class Largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 3 number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b&&b==c){System.err.println("All are equal number");}
        if(a>b && a>c)
        {
            System.out.println(a+" is largest among entered number");
        }
        if(a<b && b>c)
            {
                System.out.println(b+" is largest among entered number");
            }
        if(c>b && a<c)
            {
                 System.out.println(c+" is largest among entered number");
             }
             sc.close();
    }
}
