import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        //1.	Write a program to check if a number is positive or negative. Print "Positive" for positive numbers and "Negative" for negative numbers.

        int num = s.nextInt();
        if(num > 0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
