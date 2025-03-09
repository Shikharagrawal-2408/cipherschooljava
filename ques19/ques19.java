
import java.util.Scanner;

public class ques19 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("-1"); 
            return;
            
        }
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println(max2 == Integer.MIN_VALUE ? "-1" : "Second largest element: " + max2);

        sc.close();
    }
}
