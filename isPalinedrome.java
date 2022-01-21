import java.util.Locale;
import java.util.Scanner;

public class isPalinedrome {
    public static void main(String [] args) {

        Boolean check = true;
        // Keep the program running so that the user can check another string
        while (check) {
            // Prompt user to input a string
            System.out.println("Enter a string to check if it's a palindrome or not: ");
            Scanner scan = new Scanner(System.in);
            String userInput = scan.next();
            // Check to see if it's a palindrome or not
            if (isPalindrome(userInput)) {
                System.out.println("It is a palindrome");
            } else {
                System.out.println("It is not a palindrome");
            }
            // Ask for user input whether they want to check another string
            System.out.println("Do you want to try another string?");
            String input = scan.next().toLowerCase();
            // Only exit when the user says no/NO
            check = !input.equals("no");
            
        }
    }

    public static boolean isPalindrome(String str){
        // Points to the first and the last character of the string
        int i = 0, j = str.length() - 1;
        // Check to see if char at i and char at j are the same or not
        while (i < j){
            // Return false if they are not the same
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            // Increment i and decrement j
            i++;
            j--;
        }
        // If they are the same, return true
        return true;
    }
}
