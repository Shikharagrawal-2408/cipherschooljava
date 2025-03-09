

import java.util.Scanner;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        
        String operator = sc.next();
        
        int num2 = sc.nextInt();

        int result = 0;
        boolean valid = true;

        switch (operator) {
            case "+": result = num1 + num2; break;
            case "-": result = num1 - num2; break;
            case "*": result = num1 * num2; break;
            case "/": 
                if (num2 != 0) 
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                }
                break;
            case "%": 
                if (num2 != 0) 
                    result = num1 % num2;
                else {
                    System.out.println("Error: Modulo by zero is not allowed.");
                    valid = false;
                }
                break;
            case "<<": result = num1 << num2; break; // Left shift
            case ">>": result = num1 >> num2; break; // Right shift
            case "&": result = num1 & num2; break;  // Bitwise AND
            case "|": result = num1 | num2; break;  // Bitwise OR
            case "^": result = num1 ^ num2; break;  // Bitwise XOR
            default:
                System.out.println("Error: Invalid operator.");
                valid = false;
        }

        // Print the result if valid
        if (valid) {
            System.out.println("Output: " + result);
        }

        sc.close();

        
    }
}
