// package cipherschooljava.ques17;

import java.util.Scanner;

public class ques17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        int arr3[][]=new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                 arr3[i][j] = 0; 
                for (int k = 0; k < 2; k++) { 
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
            }
        


        sc.close();
    }
}
