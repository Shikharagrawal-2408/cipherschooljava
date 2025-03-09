import java.util.Arrays;
import java.util.Scanner;

public class ques22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        
        if (a.length() != b.length()) {
            System.out.println("False");
            sc.close();
            return;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2) ? "True" : "False");

        sc.close();
    }
}
