import java.util.*;

public class main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("initial value of a "+a); 
        System.out.println("initial value of b "+b); 
        a = a + b; 
        b = a - b; 
        a = a - b; 
         System.out.println("changed value of a "+a); 
        System.out.println("changed value of b "+b);
        sc.close ();
    }
}