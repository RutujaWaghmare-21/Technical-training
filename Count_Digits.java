import java.util.Scanner;
public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0, temp = n;
        while(temp != 0) { temp /= 10; count++; }
        System.out.println("Count is: "+count);
    }
}
