import java.util.Scanner;

public class ques16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

            if(n==1)
            {
                System.out.println("0");
            }
            else if(n==2)
            {
                System.out.println("0 1");
            }
             else {
            int a = 0, b = 1;
            System.out.print(a + " " + b);

            for (int i = 3; i <= n; i++) { 
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
        }
            sc.close();
        }
}