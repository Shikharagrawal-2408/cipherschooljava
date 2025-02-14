package cipherschooljava.ques22;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a =sc.nextLine();
        String b=sc.nextLine();

        if(a.length()!=b.length())
        {
            System.out.println("FALSE");
        }
        int count=0;
        for (int i = 0; i < a.length(); i++) {  
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i)==b.charAt(j))
                {
                    count++;
                }
            }
        }

        if(count==a.length())
        {
            System.out.println("True");
        }
        else
        {
          System.out.println("False"); 
        }
        
        sc.close();
    }
}
