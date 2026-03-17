import java.util.Scanner;
public class Check_Alphabet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
            System.out.println("Is a Alphabet");
        }
        else
        {
            System.out.println("Is a Not a Alphabet");
        }
    }
}
