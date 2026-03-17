import java.util.Stack; 
import java.util.Scanner; 

public class Patter_check {
        public static void main(String[] args) { 
        System.out.println("Try programiz.pro"); 
        Stack<Character> b = new Stack<>(); 
        String as; 
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter a string:"); 
        as = s.nextLine(); 
        for (int i = 0; i < as.length(); i++) { 
            char currentChar = as.charAt(i); 
            if (!b.isEmpty() && b.peek() == currentChar) { 
                b.pop(); 
            } else { 
                b.push(currentChar); 
            } 
        } 
        if (b.isEmpty()) { 
            System.out.println(-1); 
        } else { 
            System.out.println(b); 
        } 
        s.close(); 
    } 
}


