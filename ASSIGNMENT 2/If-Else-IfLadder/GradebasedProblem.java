import java.util.*;
class GradebasedProblem{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int grade = s.nextInt();
        //1.Write a program that assigns grades based on marks: 90 and above (A), 80-89 (B), 70-79 (C), 60-69 (D), below 60 (F).
        if(grade >= 90){
            System.out.println("Grade :'A'");
        }
        else if(grade >= 80 && grade <=89){
            System.out.println("Grade :'B'");
        }
        else if(grade >= 70 && grade <=79){
            System.out.println("Grade :'C'");
        }
        else if(grade >= 60 && grade <=69){
            System.out.println("Grade :'D'");
        }
        else if(grade < 60){
            System.out.println("Grade :'F'");
        }
    }
}