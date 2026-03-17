import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine(); 

        if (str == null || str.isEmpty()) {
            System.out.println("String is null or empty");
        } else 
        {
            System.out.println("String has content");
        }
        sc.close();
    }
}