import java.util.*;
public class ques9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum[]=new int[n];
        int [][]arr =new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                sum[i]+=arr[i][j];
            }
        }
        int max=sum[0];
        int max1=1;
        for (int i = 1; i < sum.length; i++)
        {
            if(max<sum[i])
            {
                max=sum[i];
                max1=i+1;
            }
        }
        System.out.println("Row with the maximum sum: "+max1);
        System.out.println("Maximum Sum: "+max);

        sc.close();

    }
}