import java.util.Scanner;
public class FactorialDigitSum{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative number:");
        int num = scanner .nextInt();
        long factorial = calculateFactorial(num);
        int digitSum = calculateDigitSum(factorial);
        System.out.println("Factorial of "+ num + "is: " + factorial);
        System.out.println("Sum of digits of the factorial:" + digitSum);
    
    }
    public static long calculateFactorial(int n){
        if (n == 0){
            return 1;
        } else {
            return n * calculateFactorial(n - 1);

        }
    }
    public static int
    calculateDigitSum(long num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;

        }
        return sum;
    }
}