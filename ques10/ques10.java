
import java.util.Scanner;

public class ques10 {

   static class Student
    {
        String name;
        int rollnumber;
        float marks;

        Student(String n, int roll, float m) {
            name=n;
            rollnumber=roll;
            marks=m;
        }
        void display()
        {
            System.out.println("Name: "+name);
            System.out.println("RollNumber: "+rollnumber);
            System.out.println("Marks: "+marks);
        }
        void updateMarks(float newMarks)
        {
            marks = newMarks;
        }
        
        void updateMarksByPercentage(float percentage) 
        {
            marks += (this.marks * percentage / 100);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter name: ");
        String name=sc.nextLine();
        System.out.println("enter roll number");
        int n=sc.nextInt();
        System.out.println("enter marks");
        float marks=sc.nextFloat();

        Student student = new Student(name, n, marks);

        // Display initial details
        System.out.println("\nStudent Details:");
        student.display();

        // Updating marks using direct value
        System.out.print("\nEnter new marks: ");
        float newMarks = sc.nextFloat();
        student.updateMarks(newMarks);
        System.out.println("Updated Details:");
        student.display();

        // Updating marks by percentage increase
        System.out.print("\nEnter percentage increase: ");
        float percentage = sc.nextFloat();
        student.updateMarksByPercentage(percentage);
        System.out.println("Updated Details:");
        student.display();

        sc.close();
    }
    
}