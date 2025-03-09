import java.util.Scanner;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        double salary=sc.nextDouble();
        boolean dues=sc.nextBoolean();

        boolean result = (age >= 18 && salary >= 30000 && dues);

        System.out.println(result ? "You are eligible for premium membership" : "You are not eligible for premium membership");
        sc.close();

    }
    
}
