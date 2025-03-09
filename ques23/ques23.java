
import java.util.Scanner;

public class ques23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 0; i < n; i++) {
        int a=1;
           for (int j = 0; j <=i; j++) {
            System.out.print(a+" ");
            a = a * (i - j) / (j + 1);
           } 
           System.out.println();
        }

        sc.close();
        
        
    }
    
}
