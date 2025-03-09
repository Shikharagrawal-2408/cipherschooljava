import java.util.Scanner;

public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>5000)
        {
            System.out.println("Discount: "+n*0.2);
            System.out.println("Final Amount: "+(n-n*0.2));
        }

        else if(n>3000 && n<=5000)
        {
            System.out.println("Discount: "+n*0.1);
            System.out.println("Final Amount: "+(n-n*0.1));
        }
        else
        {
            System.out.println("Final Amount: "+n);
        }

        sc.close();
    }
    
}