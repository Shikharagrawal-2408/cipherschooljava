package cipherschooljava.ques25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int count=0;
            for (int j = 1; j <=i; j++) {
                if(i%j==0)
                {
                    count++;
                }
            }

            if(count==2)
            {
                System.out.println(i+" ");
            }
            count=0;
        }

        sc.close();
    }
    
}
