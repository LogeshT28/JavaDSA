import java.util.Scanner;

public class TriangleLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //4.	Write a program to determine the type of triangle based on side lengths: equilateral, isosceles, or scalene.
        double side1 = s.nextDouble(); 
        double side2 = s.nextDouble();
        double side3 = s.nextDouble();
        if(side1== side2 && side2==side3){
            System.out.println("Equilateral");
        }
        else if(side1 == side2 || side2 == side3 || side3 == side1){
            System.out.println("isosceles");
        }
        else{
            System.out.println("Scalne");
        }
    }
}
