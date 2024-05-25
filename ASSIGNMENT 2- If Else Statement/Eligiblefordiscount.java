import java.util.Scanner;

public class Eligiblefordiscount {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        //3.	Write a program to check if a person is eligible for a senior citizen discount (age >= 60). Print "Eligible for discount" or "Not eligible for discount."
        int eligibleage = s.nextInt();
        if(eligibleage >= 60 ){
            System.out.println("Eligible for discount");
        }
        else{
            System.out.println("Not Eligible for discount");           
        }
    }
}
