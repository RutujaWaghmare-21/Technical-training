import java.util.Scanner;
public class vowel_consonant {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a charater");
        String a= s.nextLine();
        a = a.toLowerCase();
        if(a.charAt(0)=='a'||a.charAt(0)=='e'||a.charAt(0)=='i'||a.charAt(0)=='o'||a.charAt(0)=='u')
        {
            System.out.println(a+" is "+"Vowel");
        }
        else{
            System.out.println(a+" is "+"Consonant");
        }
        s.close();

    }
}
