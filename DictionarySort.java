import java.util.Arrays;
import java.util.Scanner;

public class DictionarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many words do you want to sort? ");
        int n = sc.nextInt();
        String[] words = new String[n];

        System.out.println("Enter the words:");
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }

        Arrays.sort(words);

        System.out.println("\nWords in dictionary order:");
        for (String s : words) {
            System.out.println(s);
        }
    }
}