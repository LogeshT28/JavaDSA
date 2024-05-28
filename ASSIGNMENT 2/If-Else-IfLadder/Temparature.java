import java.util.Scanner;

public class Temparature {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //2.Create a program to check the temperature and print "Cold" if below 0, "Cool" if 0-20, "Warm" if 21-30, and "Hot" if above 30.
        int temp = s.nextInt();
        if(temp < 0){
            System.out.println("Cold");
        }
        else if(temp >=0 && temp <=20){
            System.out.println("Cool");
        }
        else if(temp >=21 && temp <=30){
            System.out.println("warm");
        }
        else if(temp > 30){
            System.out.println("Hot");
        }
    }
}
