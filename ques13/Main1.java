import java.util.Scanner;

class ques13 {  // Class name must match the filename
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        boolean isPalindrome = true;
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {  
            if (str.charAt(i) != str.charAt(len - 1 - i)) { // Compare first half with reversed second half
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
