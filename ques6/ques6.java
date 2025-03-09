import java.util.Scanner;

public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String [] arr=s1.split(" ");

        int max=0,max1=0;
        for (int i = 0; i < arr.length; i++)
        {
            if(max<arr[i].length())
            {
                max=arr[i].length();
                max1=i;
            }
        }
        System.out.println(arr[max1]);

        sc.close();
    }
    
}
