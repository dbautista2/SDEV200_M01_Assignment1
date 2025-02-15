// 6.31
import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome."); 
        } else {
            System.out.println(number + " is not a palindrome.");
        } 
    }    
        public static int reverse(int number) {
            int reversedNumber = 0;
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            return reversedNumber;
        }

        public static boolean isPalindrome(int number) {
            return number == reverse(number);
        }
}