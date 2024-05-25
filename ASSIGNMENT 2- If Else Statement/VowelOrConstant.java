import java.util.*;
public class VowelOrConstant {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        //2.	Create a program that checks if a given character is a vowel or consonant. Print the result.

        String var = s.nextLine();
        char ch = var.charAt(0);
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel");
        }
        else{
            System.out.println("Constant");
        }
        
    }  
}
