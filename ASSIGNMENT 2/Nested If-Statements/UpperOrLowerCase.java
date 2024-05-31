import java.util.Scanner;

public class UpperOrLowerCase {
    public static void main(String[] args) {
        //2.	Develop a program that checks if a character is an alphabet and, if true, checks whether it is uppercase or lowercase.
        Scanner s = new Scanner(System.in);
        char c= s.next().charAt(0);
        if((c >='A' && c <='Z') ||(c >='a' && c <='z')){
            if(c >='A' && c <='Z'){
                System.out.println("The character is UpperCase");
            }
            else{
                System.out.println("The character is LowerCase");
            }
        }else{
            System.out.println("The character is Not an alphabet");
        }
    }
}
