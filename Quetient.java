import java.util.Scanner;

class Quetient
{
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int c= sc.nextInt();
      int b=sc.nextInt();
      System.out.println("quotient is:"+(c/b));
      System.out.println("reminder is:"+(c%b));
      sc.close();
    }  
}