import java.util.Scanner;

public class CatograzieNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //3.	Develop a program to categorize a number as "Positive", "Negative", or "Zero"
        int num = s.nextInt();
        if(num == 0){
            System.out.println("Zero");
        }
        else if(num >0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
    }
}
