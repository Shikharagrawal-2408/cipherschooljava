import java.util.Scanner;

class ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        sc.close();

        int stars = 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println(); 
            stars += 2; 
        }

        for (int i = n; i >=0; i--) {
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println(); 
            stars -= 2; 
        }
        
    }
}
