//Addtion of 2 int number and multiplication of 2 float number
import java.util.Scanner;
public class Add_Multipy {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a1=s.nextInt();
        int a2=s.nextInt();
        float a=s.nextFloat();
        float b=s.nextFloat();
        System.out.println("Addition of 2 number is:"+(a1+a2));
        System.out.println("Multipication of 2 number is:"+(a*b));
        s.close();
    }
}
