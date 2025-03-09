public class ques2 {
    public static void main(String[] args) {
        int num = 25;
        double decimalNum = 15.75;
        char letter = 'B';
        boolean flag = true;

        System.out.println("Original Values:");
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimalNum);
        System.out.println("Character: " + letter);
        System.out.println("Boolean: " + flag);

        double convertedDouble = num;
        int asciiValue = letter;

        System.out.println("\nAfter Type Conversion:");
        System.out.println("Converted int to double: " + convertedDouble);
        System.out.println("Converted char to int (ASCII Value): " + asciiValue);
    }
}
