import java.util.Scanner;

public class Assign_5 {
    public static void main(String[] args) {

Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter the marks");
        int marks=sc.nextInt();
        if(marks>75)
        {
            System.out.println("Student is in Distinction");
        }
        else if(marks>60)
        {
            System.out.println("Student is in First class");
        }
        else if(marks>55)
        {
            System.out.println("Student is in Second class");
        }
        else if(marks>35)
        {
            System.out.println("Student is in pass class");
        }
        else
        {
            System.out.println("Student is fail");
        }
    }
}