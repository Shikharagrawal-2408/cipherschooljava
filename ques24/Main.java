package cipherschooljava.ques24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int candidate = findMajorityElement(arr);
        System.out.println(candidate);

        sc.close();
    }

    public static int findMajorityElement(int[] arr) {
        int candidate = -1, count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate; 
    }
}