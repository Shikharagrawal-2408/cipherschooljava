import java.util.Scanner;

public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current permissions (0-15): ");
        short n=sc.nextShort();
        System.out.println("Enter the bit position to toggle (0-3): ");
        int n1=sc.nextInt();


        int temp=n;
        if (n > 15 || n < 0 || n1 < 0 || n1 > 3) {
            System.out.println("Invalid input! Permissions must be between 0-15, and bit position must be 0-3.");
            sc.close();
            return;
        }
        //convert to binary
        int ans=0;   //to store the converted answer
        int pw=1; //representing power off 10

        while(temp>0)
        {
            int parity=temp%2;
            ans+=(parity*pw);
            temp/=2;
            pw*=10;
        }
        System.out.printf("Original permissions: %04d\n", ans);

        n ^= (1 << n1);
        

        ans=0;   //to store the converted answer
        pw=1; //representing power off 10

        while(n>0)
        {
            int parity=n%2;
            ans+=(parity*pw);
            n/=2;
            pw*=10;
        }

        System.out.printf("Updated permissions: %04d\n", ans);
        sc.close();
    }
    
}