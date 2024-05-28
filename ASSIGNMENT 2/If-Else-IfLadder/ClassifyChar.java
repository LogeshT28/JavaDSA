import java.util.Scanner;

public class ClassifyChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        if(Character.isUpperCase(c)){
            System.out.println("Uppercase");
        }
        else if(Character.isLowerCase(c)){
            System.out.println("Lowercase");
        }
        else if(Character.isDigit(c)){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special charcter");
        }
    }
}
