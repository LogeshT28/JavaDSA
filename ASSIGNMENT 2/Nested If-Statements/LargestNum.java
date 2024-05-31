import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        //1.	Write a program to find the largest of three numbers using nested if statements.
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int n3 = s.nextInt();
        int largeNumber= 0;
        if(n1 >= n2){
            if(n1 >=n3){
                    largeNumber=n1;
            }
            else{
                largeNumber=n3;
            }
        }
        else{
            if(n2>=n3){
                largeNumber= n2;
            }
            else{
                largeNumber=n3;
            }
        }
        System.out.println(largeNumber);
    }
}
