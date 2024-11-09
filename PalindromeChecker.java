import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String inputString = scanner .nextLine();
        if (isPalindrome(inputString)){
            System.out.println(inputString +" is a palindrome.");
        }
        else{
            System.out.println(inputString + " is not a palindrome.");
        }
        scanner .close();
    }
    public static boolean isPalindrome(String str){
        String reversedString = reverseString(str);
        return str.equalsIgnoreCase(reversedString);
    }
    public static String reverseString(String str){
        String reversed = "";
        for  (int i = str.length() - 1; i>= 0; i--){
            reversed += str.charAt(i);

        }
        return reversed;
    }
}
